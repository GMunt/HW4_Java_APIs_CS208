package cs208;

import org.springframework.web.bind.annotation.*;
import java.util.Random;

@RestController
public class PracticeController
{

    // TODO: create a GET route with two query parameters
    // http://localhost:8080/display_name?first_name=<yourFirstName>&last_name=<yourLastName>
    // GET /display_name?first_name=<yourFirstName>&last_name=<yourLastName>
    @GetMapping("/display_name")
    String getSearchWithTwoParameters(
            @RequestParam("first_name") String parameter1,
            @RequestParam("last_name") String parameter2
    )
    {
        System.out.println("PracticeController.display_name - START");
        System.out.println("first_name = " + parameter1);
        System.out.println("last_name = " + parameter2);
        System.out.println("PracticeController.display_name - END");

        String valueReturnedToBrowser =
                "These are the values of parameters passed in the URL:<br>" +
                        "first_name = " + parameter1 + "<br>" +
                        "last_name = " + parameter2 + "<br><br>" +
                        "NOTE: the parameters are separated in the URL by an ampersand (&amp;) character.<br><br>" +
                        "<hr>" +
                        "Find me in the PracticeController.display_name() method";

        return valueReturnedToBrowser;
    }
    // TODO: create a GET route with a path parameter
    // http://localhost:8080/user/{yourBSUUsername}/profile
    // GET /user/{yourBSUUsername}/profile
    @GetMapping("/user/{yourBSUUsername}/profile")
    String getRouteWithPathParameters(
            @PathVariable("yourBSUUsername") String yourBSUUsername
    )
    {
        System.out.println("PracticeController.user/{bsuUsername}/profile - START");
        System.out.println("yourBSUUsername = " + yourBSUUsername);
        System.out.println("PracticeController.user/yourBSUUsername/profile - END");

        String valueReturnedToBrowser =
                "These are the values of parameters passed in the URL:<br>" +
                        "yourBSUUsername = " + yourBSUUsername +"<br><br>" +
                        "<hr>" +
                        "Find me in the PracticeController.user/{yourBSUUsername}/profile";

        return valueReturnedToBrowser;
    }


    // TODO: create a POST route with two form parameters
    // http://localhost:8080/create_user
    // POST /create_user
    @PostMapping("/create_user")
    String postCreateUser(
            @RequestParam("first_name") String first_name,
            @RequestParam("last_name") String last_name
    )
    {
        System.out.println("PracticeController.postCreateUser - START");
        System.out.println("first_name = " + first_name);
        System.out.println("last_name = " + last_name);
        System.out.println("PracticeController.postCreateUser - END");

        String valueReturnedToClient =
                "Parameters received in the body of the POST request:\n" +
                        "first_name = " + first_name + "\n" +
                        "last_name = " + last_name + "\n\n" +
                        "This REST API route would create a new issue with the first and last name specified in the parameters.\n\n" +
                        "<hr>" +
                        "Find me in the PracticeController.postCreateUser() method";

        return valueReturnedToClient;
    }


    // TODO: create a PATCH route
    // http://localhost:8080/user/{yourBSUUsername}/update_profile
    // PATCH /user/{yourBSUUsername}/update_profile
    @PatchMapping("/user/{yourBSUUsername}/update_profile")
    String patchUpdateProfile(
            @RequestParam("yourBSUUsername") String yourBSUUsername
    )
    {
        System.out.println("PracticeController.patchUpdateProfile - START");
        System.out.println("yourBSUUsername = " + yourBSUUsername);
        System.out.println("PracticeController.patchUpdateProfile - END");

        String valueReturnedToClient =
                "Parameters received in the body of the PATCH request:\n" +
                        "yourBSUUsername = " + yourBSUUsername + "\n\n" +
                        "<hr>" +
                        "Find me in the PracticeController.patchUpdateProfile() method";

        return valueReturnedToClient;
    }

    // TODO: create a DELETE route
    // http://localhost:8080/resource/{resourceId}
    // DELETE /resource/{resourceId}
    @DeleteMapping("/resource/{resourceId}")
    String deleteResource(
            @PathVariable("resourceId") String resourceId
    )
    {
        System.out.println("PracticeController.deleteResource - START");
        System.out.println("Deleted username resourceId = " + resourceId);
        System.out.println("PracticeController.deleteResource - END");

        String valueReturnedToClient =
                "Parameter received in the body of the DELETE request:\n" +
                        "Deleted: yourBSUUsername at Resource ID = " + resourceId + "\n\n" +
                        "<hr>" +
                        "Find me in the PracticeController.deleteResource() method";
        return valueReturnedToClient;
    }

    // TODO: create a GET API that returns a random resource
    Random rand = new Random();
    // http://localhost:8080/api/random_robot_name
    // GET /api/{random_robot_name}
    @GetMapping("/api/random_robot_name")
    String getRandomRobotName()
    {
        String[] robot_name_array =
            {"C-3PO", "R2-D2", "H.E.R.B.I.E", "Baymax", "Rosie", "Optimus Prime", "Ultron"};

        String random_robot_name = robot_name_array[rand.nextInt(robot_name_array.length)];
        System.out.println("PracticeController.getRandomRobotName - START");
        System.out.println("random_robot_name = " + random_robot_name);
        System.out.println("PracticeController.getRandomRobotName - END");

        String res =
                "Randomly selected robot name is: " + random_robot_name;

        return res;
    }
    // http://localhost:8080/api/random_movie_quote
    // GET /api/{random_movie_quote}
    @GetMapping("/api/random_movie_quote")
    String getRandomMovieQuote()
    {
        String[] movie_quote_array = {
                "May the Force be with you. - Star Wars",
                "I see dead people. - The Sixth Sense",
                "Why so serious. - The Dark Knight",
                "There's no place like home - The Wizard of Oz"
                                    };

        System.out.println("PracticeController.getRandomMovieQuote - START");
        System.out.println("movie_quote_array = " + movie_quote_array[rand.nextInt(movie_quote_array.length)]);
        System.out.println("PracticeController.getRandomMovieQuote - END");

        String res =
                "Randomly selected movie quote is: " + movie_quote_array[rand.nextInt(movie_quote_array.length)];

        return res;
    }
}
