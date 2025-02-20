package cs208;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController
{

    // TODO: create a GET route with two query parameters
    // http://localhost:8080/display_name?first_name=<yourFirstName>&last_name=<yourLastName>
    // Get /display_name?first_name=<yourFirstName>&last_name=<yourLastName>
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


    // TODO: create a POST route with two form parameters


    // TODO: create a PATCH route


    // TODO: create a DELETE route


    // TODO: create a GET API that returns a random resource

}
