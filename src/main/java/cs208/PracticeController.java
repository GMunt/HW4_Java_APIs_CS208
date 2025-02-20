package cs208;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


    // TODO: create a PATCH route


    // TODO: create a DELETE route


    // TODO: create a GET API that returns a random resource

}
