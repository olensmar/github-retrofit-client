package com.olensmar.apis.github;

import retrofit.client.Response;
import retrofit.http.*;
import retrofit.mime.TypedByteArray;

/**
 * Generated with Ready! API Retrofit Plugin
 **/

public interface GitHubAPI {
   @GET("/search/repositories")
   public Response getRepositories(@Query("sort") String sort , @Query("order") String order , @Query("q") String q );

   @GET("/search/code")
   public Response getCode(@Query("sort") String sort , @Query("order") String order , @Query("q") String q );

   @GET("/search/users")
   public Response getUsers(@Query("sort") String sort , @Query("order") String order , @Query("q") String q );

   @GET("/events")
   public Response getEvents();

   @GET("/feeds")
   public Response getFeeds();

   @GET("/meta")
   public Response getMeta();

   @GET("/rate_limit")
   public Response getRateLimit();

   @GET("/issues")
   public Response getIssues(@Query("sort") String sort , @Query("direction") String direction , @Query("labels") String labels , @Query("state") String state , @Query("since") String since , @Query("filter") String filter );

   @GET("/notifications")
   public Response getNotifications(@Query("participating") String participating , @Query("since") String since , @Query("all") String all );

   @PUT("/notifications")
   public Response putNotifications(@Body TypedByteArray body );

   @GET("/notifications/threads/{id}")
   public Response getThreadById(@Path("id") String id );

   @PATCH("/notifications/threads/{id}")
   public Response patchThreadById(@Path("id") String id );

   @GET("/notifications/threads/{id}/subscription")
   public Response getSubscription(@Path("id") String id );

   @PUT("/notifications/threads/{id}/subscription")
   public Response putSubscription(@Path("id") String id , @Body TypedByteArray body );

   @DELETE("/notifications/threads/{id}/subscription")
   public Response deleteSubscription(@Path("id") String id );

   @GET("/gists")
   public Response getGists(@Query("since") String since );

   @POST("/gists")
   public Response postGists(@Body TypedByteArray body );

   @GET("/gists/public")
   public Response getPublic(@Query("since") String since );

   @GET("/gists/starred")
   public Response getStarred(@Query("since") String since );

   @GET("/gists/{id}")
   public Response getGistById(@Path("id") String id );

   @PATCH("/gists/{id}")
   public Response patchGistById(@Path("id") String id );

   @DELETE("/gists/{id}")
   public Response deleteGistById(@Path("id") String id );

   @GET("/gists/{id}/star")
   public Response getStar(@Path("id") String id );

   @PUT("/gists/{id}/star")
   public Response putStar(@Path("id") String id , @Body TypedByteArray body );

   @DELETE("/gists/{id}/star")
   public Response deleteStar(@Path("id") String id );

   @POST("/gists/{id}/forks")
   public Response postForks(@Path("id") String id , @Body TypedByteArray body );

   @GET("/gists/{id}/comments")
   public Response getComments(@Path("id") String id );

   @POST("/gists/{id}/comments")
   public Response postComments(@Path("id") String id , @Body TypedByteArray body );

   @GET("/gists/{id}/comments/{commentId}")
   public Response getCommentByCommentId(@Path("id") String id , @Path("commentId") String commentId );

   @PATCH("/gists/{id}/comments/{commentId}")
   public Response patchCommentByCommentId(@Path("id") String id , @Path("commentId") String commentId );

   @DELETE("/gists/{id}/comments/{commentId}")
   public Response deleteCommentByCommentId(@Path("id") String id , @Path("commentId") String commentId );

   @GET("/orgs/{orgId}")
   public Response getOrgByOrgId(@Path("orgId") String orgId );

   @PATCH("/orgs/{orgId}")
   public Response patchOrgByOrgId(@Path("orgId") String orgId );

   @GET("/orgs/{orgId}/events")
   public Response getOrgIdEvents(@Path("orgId") String orgId );

   @GET("/orgs/{orgId}/issues")
   public Response getOrgIdIssues(@Path("orgId") String orgId , @Query("sort") String sort , @Query("direction") String direction , @Query("labels") String labels , @Query("state") String state , @Query("since") String since , @Query("filter") String filter );

   @GET("/orgs/{orgId}/members")
   public Response getMembers(@Path("orgId") String orgId );

   @DELETE("/orgs/{orgId}/members/{userId}")
   public Response deleteMemberByUserId(@Path("orgId") String orgId , @Path("userId") String userId );

   @GET("/orgs/{orgId}/public_members")
   public Response getPublicMembers(@Path("orgId") String orgId );

   @GET("/orgs/{orgId}/public_members/{userId}")
   public Response getPublicMemberByUserId(@Path("orgId") String orgId , @Path("userId") String userId );

   @PUT("/orgs/{orgId}/public_members/{userId}")
   public Response putPublicMemberByUserId(@Path("orgId") String orgId , @Path("userId") String userId , @Body TypedByteArray body );

   @DELETE("/orgs/{orgId}/public_members/{userId}")
   public Response deletePublicMemberByUserId(@Path("orgId") String orgId , @Path("userId") String userId );

   @GET("/orgs/{orgId}/teams")
   public Response getTeams(@Path("orgId") String orgId );

   @POST("/orgs/{orgId}/teams")
   public Response postTeams(@Path("orgId") String orgId , @Body TypedByteArray body );

   @GET("/orgs/{orgId}/repos")
   public Response getRepos(@Path("orgId") String orgId , @Query("type") String type );

   @POST("/orgs/{orgId}/repos")
   public Response postRepos(@Path("orgId") String orgId , @Body TypedByteArray body );

   @GET("/teams/{teamsId}")
   public Response getTeamByTeamsId(@Path("teamsId") String teamsId );

   @PATCH("/teams/{teamsId}")
   public Response patchTeamByTeamsId(@Path("teamsId") String teamsId );

   @DELETE("/teams/{teamsId}")
   public Response deleteTeamByTeamsId(@Path("teamsId") String teamsId );

   @GET("/teams/{teamsId}/members")
   public Response getTeamsIdMembers(@Path("teamsId") String teamsId );

   @GET("/teams/{teamsId}/members/{userId}")
   public Response getMemberByUserId(@Path("userId") String userId , @Path("teamsId") String teamsId );

   @PUT("/teams/{teamsId}/members/{userId}")
   public Response putMemberByUserId(@Path("userId") String userId , @Path("teamsId") String teamsId , @Body TypedByteArray body );

   @DELETE("/teams/{teamsId}/members/{userId}")
   public Response deleteTeamsIdMemberByUserId(@Path("userId") String userId , @Path("teamsId") String teamsId );

   @GET("/repositories")
   public Response getRepositories_1(@Query("since") String since );

   @GET("/repos/{ownerId}/{repoId}")
   public Response getRepoByOwnerIdAndRepoId(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @PATCH("/repos/{ownerId}/{repoId}")
   public Response patchRepoByOwnerIdAndRepoId(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @DELETE("/repos/{ownerId}/{repoId}")
   public Response deleteRepoByOwnerIdAndRepoId(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/events")
   public Response getRepoIdEvents(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/languages")
   public Response getLanguages(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/git/blobs")
   public Response postBlobs(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/git/blobs/{shaCode}")
   public Response getBlobByShaCode(@Path("ownerId") String ownerId , @Path("shaCode") String shaCode , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/git/commits")
   public Response postCommits(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/git/commits/{shaCode}")
   public Response getCommitByShaCode(@Path("ownerId") String ownerId , @Path("shaCode") String shaCode , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/git/refs")
   public Response getRefs(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/git/refs")
   public Response postRefs(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/git/refs/{heads}")
   public Response getRefByHeads(@Path("ownerId") String ownerId , @Path("heads") String heads , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/git/refs/{heads}/{branch}")
   public Response getRefByHeadsAndBranch(@Path("ownerId") String ownerId , @Path("heads") String heads , @Path("branch") String branch , @Path("repoId") String repoId );

   @PATCH("/repos/{ownerId}/{repoId}/git/refs/{heads}/{branch}")
   public Response patchRefByHeadsAndBranch(@Path("ownerId") String ownerId , @Path("heads") String heads , @Path("branch") String branch , @Path("repoId") String repoId );

   @DELETE("/repos/{ownerId}/{repoId}/git/refs/{heads}/{branch}")
   public Response deleteRefByHeadsAndBranch(@Path("ownerId") String ownerId , @Path("heads") String heads , @Path("branch") String branch , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/git/tags")
   public Response postTags(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/git/tags/{shaCode}")
   public Response getTagByShaCode(@Path("ownerId") String ownerId , @Path("shaCode") String shaCode , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/git/trees")
   public Response postTrees(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/git/trees/{shaCode}")
   public Response getTreeByShaCode(@Query("recursive") String recursive , @Path("ownerId") String ownerId , @Path("shaCode") String shaCode , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/readme")
   public Response getReadme(@Query("ref") String ref , @Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/stargazers")
   public Response getStargazers(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/subscribers")
   public Response getSubscribers(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/tags")
   public Response getTags(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/teams")
   public Response getRepoIdTeams(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/watchers")
   public Response getWatchers(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/contributors")
   public Response getContributors(@Query("anon") String anon , @Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/branches")
   public Response getBranches(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/branches/{branchId}")
   public Response getBranchByBranchId(@Path("branchId") String branchId , @Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/issues")
   public Response getRepoIdIssues(@Query("sort") String sort , @Query("direction") String direction , @Path("ownerId") String ownerId , @Query("labels") String labels , @Query("state") String state , @Path("repoId") String repoId , @Query("since") String since , @Query("filter") String filter );

   @POST("/repos/{ownerId}/{repoId}/issues")
   public Response postIssues(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/issues/events")
   public Response getIssuesEvents(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/issues/events/{eventId}")
   public Response getEventByEventId(@Path("eventId") String eventId , @Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/issues/{number}")
   public Response getIssueByNumber(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @PATCH("/repos/{ownerId}/{repoId}/issues/{number}")
   public Response patchIssueByNumber(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/issues/{number}/comments")
   public Response getNumberComments(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/issues/{number}/comments")
   public Response postNumberComments(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/issues/{number}/events")
   public Response getNumberEvents(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/issues/{number}/events/{eventId}")
   public Response getNumberEventByEventId(@Path("eventId") String eventId , @Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/issues/{number}/labels")
   public Response getLabels(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/issues/{number}/labels")
   public Response postLabels(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId , @Body TypedByteArray body );

   @PUT("/repos/{ownerId}/{repoId}/issues/{number}/labels")
   public Response putLabels(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId , @Body TypedByteArray body );

   @DELETE("/repos/{ownerId}/{repoId}/issues/{number}/labels")
   public Response deleteLabels(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @DELETE("/repos/{ownerId}/{repoId}/issues/{number}/labels/{name}")
   public Response deleteLabelByName(@Path("ownerId") String ownerId , @Path("name") String name , @Path("number") String number , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/issues/comments")
   public Response getIssuesComments(@Query("sort") String sort , @Query("direction") String direction , @Path("ownerId") String ownerId , @Path("repoId") String repoId , @Query("since") String since );

   @GET("/repos/{ownerId}/{repoId}/issues/comments/{commentId}")
   public Response getIssuesCommentByCommentId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("commentId") String commentId );

   @PATCH("/repos/{ownerId}/{repoId}/issues/comments/{commentId}")
   public Response patchIssuesCommentByCommentId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("commentId") String commentId );

   @DELETE("/repos/{ownerId}/{repoId}/issues/comments/{commentId}")
   public Response deleteIssuesCommentByCommentId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("commentId") String commentId );

   @GET("/repos/{ownerId}/{repoId}/notifications")
   public Response getRepoIdNotifications(@Path("ownerId") String ownerId , @Query("participating") String participating , @Path("repoId") String repoId , @Query("since") String since , @Query("all") String all );

   @PUT("/repos/{ownerId}/{repoId}/notifications")
   public Response putRepoIdNotifications(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/subscription")
   public Response getRepoIdSubscription(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @PUT("/repos/{ownerId}/{repoId}/subscription")
   public Response putRepoIdSubscription(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @DELETE("/repos/{ownerId}/{repoId}/subscription")
   public Response deleteRepoIdSubscription(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/assignees")
   public Response getAssignees(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/assignees/{assignee}")
   public Response getAssigneeByAssignee(@Path("ownerId") String ownerId , @Path("assignee") String assignee , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/labels")
   public Response getRepoIdLabels(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/labels")
   public Response postRepoIdLabels(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/labels/{name}")
   public Response getLabelByName(@Path("ownerId") String ownerId , @Path("name") String name , @Path("repoId") String repoId );

   @PATCH("/repos/{ownerId}/{repoId}/labels/{name}")
   public Response patchLabelByName(@Path("ownerId") String ownerId , @Path("name") String name , @Path("repoId") String repoId );

   @DELETE("/repos/{ownerId}/{repoId}/labels/{name}")
   public Response deleteRepoIdLabelByName(@Path("ownerId") String ownerId , @Path("name") String name , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/milestones")
   public Response getMilestones(@Query("sort") String sort , @Query("direction") String direction , @Path("ownerId") String ownerId , @Query("state") String state , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/milestones")
   public Response postMilestones(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/milestones/{number}")
   public Response getMilestoneByNumber(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @PATCH("/repos/{ownerId}/{repoId}/milestones/{number}")
   public Response patchMilestoneByNumber(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @DELETE("/repos/{ownerId}/{repoId}/milestones/{number}")
   public Response deleteMilestoneByNumber(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/milestones/{number}/labels")
   public Response getNumberLabels(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/pulls")
   public Response getPulls(@Path("ownerId") String ownerId , @Query("base") String base , @Query("state") String state , @Path("repoId") String repoId , @Query("head") String head );

   @POST("/repos/{ownerId}/{repoId}/pulls")
   public Response postPulls(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/pulls/{number}")
   public Response getPullByNumber(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @PATCH("/repos/{ownerId}/{repoId}/pulls/{number}")
   public Response patchPullByNumber(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/pulls/{number}/files")
   public Response getFiles(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/pulls/{number}/commits")
   public Response getCommits(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/pulls/{number}/merge")
   public Response getMerge(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @PUT("/repos/{ownerId}/{repoId}/pulls/{number}/merge")
   public Response putMerge(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/pulls/{number}/comments")
   public Response getPullsNumberComments(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/pulls/{number}/comments")
   public Response postPullsNumberComments(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/pulls/comments")
   public Response getPullsComments(@Query("sort") String sort , @Query("direction") String direction , @Path("ownerId") String ownerId , @Path("repoId") String repoId , @Query("since") String since );

   @GET("/repos/{ownerId}/{repoId}/pulls/comments/{number}")
   public Response getCommentByNumber(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @PATCH("/repos/{ownerId}/{repoId}/pulls/comments/{number}")
   public Response patchCommentByNumber(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @DELETE("/repos/{ownerId}/{repoId}/pulls/comments/{number}")
   public Response deleteCommentByNumber(@Path("ownerId") String ownerId , @Path("number") String number , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/collaborators")
   public Response getCollaborators(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/collaborators/{user}")
   public Response getCollaboratorByUser(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("user") String user );

   @PUT("/repos/{ownerId}/{repoId}/collaborators/{user}")
   public Response putCollaboratorByUser(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("user") String user , @Body TypedByteArray body );

   @DELETE("/repos/{ownerId}/{repoId}/collaborators/{user}")
   public Response deleteCollaboratorByUser(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("user") String user );

   @GET("/repos/{ownerId}/{repoId}/comments")
   public Response getRepoIdComments(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/comments/{commentId}")
   public Response getRepoIdCommentByCommentId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("commentId") String commentId );

   @PATCH("/repos/{ownerId}/{repoId}/comments/{commentId}")
   public Response patchRepoIdCommentByCommentId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("commentId") String commentId );

   @DELETE("/repos/{ownerId}/{repoId}/comments/{commentId}")
   public Response deleteRepoIdCommentByCommentId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("commentId") String commentId );

   @GET("/repos/{ownerId}/{repoId}/commits")
   public Response getRepoIdCommits(@Query("author") String author , @Query("sha") String sha , @Path("ownerId") String ownerId , @Query("path") String path , @Path("repoId") String repoId , @Query("since") String since , @Query("until") String until );

   @GET("/repos/{ownerId}/{repoId}/commits/{shaCode}")
   public Response getRepoIdCommitByShaCode(@Path("ownerId") String ownerId , @Path("shaCode") String shaCode , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/commits/{shaCode}/comments")
   public Response getShaCodeComments(@Path("ownerId") String ownerId , @Path("shaCode") String shaCode , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/commits/{shaCode}/comments")
   public Response postShaCodeComments(@Path("ownerId") String ownerId , @Path("shaCode") String shaCode , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/contents/{path}")
   public Response getContentByPath(@Query("ref") String ref , @Path("ownerId") String ownerId , @Query("path") String path , @Path("repoId") String repoId );

   @PUT("/repos/{ownerId}/{repoId}/contents/{path}")
   public Response putContentByPath(@Path("ownerId") String ownerId , @Path("path") String path , @Path("repoId") String repoId , @Body TypedByteArray body );

   @DELETE("/repos/{ownerId}/{repoId}/contents/{path}")
   public Response deleteContentByPath(@Path("ownerId") String ownerId , @Path("path") String path , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/{archive_format}/{path}")
   public Response getRepoByOwnerIdAndRepoIdAndArchiveFormatAndPath(@Path("archive_format") String archiveFormat , @Path("ownerId") String ownerId , @Path("path") String path , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/downloads")
   public Response getDownloads(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/downloads")
   public Response postDownloads(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/downloads/{downloadId}")
   public Response getDownloadByDownloadId(@Path("ownerId") String ownerId , @Path("downloadId") String downloadId , @Path("repoId") String repoId );

   @DELETE("/repos/{ownerId}/{repoId}/downloads/{downloadId}")
   public Response deleteDownloadByDownloadId(@Path("ownerId") String ownerId , @Path("downloadId") String downloadId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/forks")
   public Response getForks(@Query("sort") String sort , @Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/forks")
   public Response postRepoIdForks(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/keys")
   public Response getKeys(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/keys")
   public Response postKeys(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/keys/{keyId}")
   public Response getKeyByKeyId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("keyId") String keyId );

   @PATCH("/repos/{ownerId}/{repoId}/keys/{keyId}")
   public Response patchKeyByKeyId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("keyId") String keyId );

   @DELETE("/repos/{ownerId}/{repoId}/keys/{keyId}")
   public Response deleteKeyByKeyId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("keyId") String keyId );

   @GET("/repos/{ownerId}/{repoId}/hooks")
   public Response getHooks(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/hooks")
   public Response postHooks(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/hooks/{hookId}")
   public Response getHookByHookId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("hookId") String hookId );

   @PATCH("/repos/{ownerId}/{repoId}/hooks/{hookId}")
   public Response patchHookByHookId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("hookId") String hookId );

   @DELETE("/repos/{ownerId}/{repoId}/hooks/{hookId}")
   public Response deleteHookByHookId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("hookId") String hookId );

   @POST("/repos/{ownerId}/{repoId}/hooks/{hookId}/tests")
   public Response postTests(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Path("hookId") String hookId , @Body TypedByteArray body );

   @POST("/repos/{ownerId}/{repoId}/merges")
   public Response postMerges(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/statuses/{ref}")
   public Response getStatusByRef(@Path("ref") String ref , @Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @POST("/repos/{ownerId}/{repoId}/statuses/{ref}")
   public Response postStatusByRef(@Path("ref") String ref , @Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @GET("/repos/{ownerId}/{repoId}/stats/contributors")
   public Response getStatsContributors(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/stats/commit_activity")
   public Response getCommitActivity(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/stats/code_frequency")
   public Response getCodeFrequency(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/stats/participation")
   public Response getParticipation(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/repos/{ownerId}/{repoId}/stats/punch_card")
   public Response getPunchCard(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/user")
   public Response getUser();

   @PATCH("/user")
   public Response patchUser();

   @GET("/user/orgs")
   public Response getOrgs();

   @GET("/user/{userId}")
   public Response getUserByUserId(@Path("userId") String userId );

   @GET("/user/{userId}/received_events")
   public Response getReceivedEvents(@Path("userId") String userId );

   @GET("/user/{userId}/received_events/public")
   public Response getReceivedEventsPublic(@Path("userId") String userId );

   @GET("/user/{userId}/orgs")
   public Response getUserIdOrgs(@Path("userId") String userId );

   @GET("/user/{userId}/events")
   public Response getUserIdEvents(@Path("userId") String userId );

   @GET("/user/{userId}/events/public")
   public Response getEventsPublic(@Path("userId") String userId );

   @GET("/user/{userId}/events/orgs/{orgId}")
   public Response getEventsOrgByOrgId(@Path("orgId") String orgId , @Path("userId") String userId );

   @GET("/user/{userId}/starred")
   public Response getUserIdStarred(@Query("sort") String sort , @Query("direction") String direction , @Path("userId") String userId );

   @GET("/user/{userId}/subscriptions")
   public Response getSubscriptions(@Path("userId") String userId );

   @GET("/user/emails")
   public Response getEmails();

   @POST("/user/emails")
   public Response postEmails(@Body TypedByteArray body );

   @DELETE("/user/emails")
   public Response deleteEmails();

   @GET("/user/following")
   public Response getFollowing();

   @GET("/user/following/{userId}")
   public Response getFollowingByUserId(@Path("userId") String userId );

   @PUT("/user/following/{userId}")
   public Response putFollowingByUserId(@Path("userId") String userId , @Body TypedByteArray body );

   @DELETE("/user/following/{userId}")
   public Response deleteFollowingByUserId(@Path("userId") String userId );

   @GET("/user/keys")
   public Response getUserKeys();

   @POST("/user/keys")
   public Response postUserKeys(@Body TypedByteArray body );

   @GET("/user/keys/{keyId}")
   public Response getUserKeyByKeyId(@Path("keyId") String keyId );

   @PATCH("/user/keys/{keyId}")
   public Response patchUserKeyByKeyId(@Path("keyId") String keyId );

   @DELETE("/user/keys/{keyId}")
   public Response deleteUserKeyByKeyId(@Path("keyId") String keyId );

   @GET("/user/starred")
   public Response getUserStarred(@Query("sort") String sort , @Query("direction") String direction );

   @GET("/user/starred/{ownerId}/{repoId}")
   public Response getStarredByOwnerIdAndRepoId(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @PUT("/user/starred/{ownerId}/{repoId}")
   public Response putStarredByOwnerIdAndRepoId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @DELETE("/user/starred/{ownerId}/{repoId}")
   public Response deleteStarredByOwnerIdAndRepoId(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/user/subscriptions")
   public Response getUserSubscriptions();

   @GET("/user/subscriptions/{ownerId}/{repoId}")
   public Response getSubscriptionByOwnerIdAndRepoId(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @PUT("/user/subscriptions/{ownerId}/{repoId}")
   public Response putSubscriptionByOwnerIdAndRepoId(@Path("ownerId") String ownerId , @Path("repoId") String repoId , @Body TypedByteArray body );

   @DELETE("/user/subscriptions/{ownerId}/{repoId}")
   public Response deleteSubscriptionByOwnerIdAndRepoId(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

   @GET("/user/issues")
   public Response getUserIssues(@Query("sort") String sort , @Query("direction") String direction , @Query("labels") String labels , @Query("state") String state , @Query("since") String since , @Query("filter") String filter );

   @GET("/user/repos")
   public Response getUserRepos(@Query("type") String type );

   @POST("/user/repos")
   public Response postUserRepos(@Body TypedByteArray body );

   @GET("/users")
   public Response getUsers_1(@Query("since") String since );

   @GET("/users/{userId}")
   public Response getUserByUserId_1(@Path("userId") String userId );

   @GET("/users/{userId}/following/{targetUserId}")
   public Response getFollowingByTargetUserId(@Path("targetUserId") String targetUserId , @Path("userId") String userId );

   @GET("/users/{userId}/keys")
   public Response getUserIdKeys(@Path("userId") String userId );

   @GET("/users/{userId}/gists")
   public Response getUserIdGists(@Path("userId") String userId , @Query("since") String since );

   @GET("/users/{userId}/orgs")
   public Response getUsersUserIdOrgs(@Path("userId") String userId );

   @GET("/users/{userId}/repos")
   public Response getUserIdRepos(@Path("userId") String userId , @Query("type") String type );

   @GET("/gitignore/templates")
   public Response getTemplates();

   @GET("/gitignore/templates/{language}")
   public Response getTemplateByLanguage(@Path("language") String language );

   @POST("/markdown")
   public Response postMarkdown(@Body TypedByteArray body );

   @POST("/markdown/raw")
   public Response postRaw(@Body TypedByteArray body );

   @GET("/networks/{ownerId}/{repoId}/events")
   public Response getOwnerIdRepoIdEvents(@Path("ownerId") String ownerId , @Path("repoId") String repoId );

}
