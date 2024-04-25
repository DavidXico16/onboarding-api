package com.onboarding.onboardingAPI.module.client.res;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.http.HttpClient;

@RestController
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping( "/api/client" )
public class ClientController {

    @RequestMapping(value = {"/upload"}, method = {RequestMethod.POST})
    //@RequestMapping (method = {RequestMethod.POST})
    //@ResponseBody(HttpStatus.OK)
    public void getDataClient ( @RequestParam("image") MultipartFile image ) throws IOException {

        System.out.println(image.getInputStream());
        System.out.println("entroooooooo");
    }

}
