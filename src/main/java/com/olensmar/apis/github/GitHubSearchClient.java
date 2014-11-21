package com.olensmar.apis.github;

import retrofit.RestAdapter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class GitHubSearchClient {
    public static void main( String [] args ) throws IOException {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.github.com")
                .build();

        GitHubAPI service = restAdapter.create(GitHubAPI.class);

        InputStream source = service.getRepositories("", "", args[0]).getBody().in();
        String inputStreamString = new Scanner(source,"UTF-8").next();
        System.out.println(inputStreamString);
    }
}
