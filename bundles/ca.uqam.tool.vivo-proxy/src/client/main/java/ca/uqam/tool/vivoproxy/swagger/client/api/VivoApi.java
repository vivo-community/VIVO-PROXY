/*
 * VIVO Proxy API
 * Proxy API for VIVO Data Manipulation
 *
 * OpenAPI spec version: 1.0.0
 * Contact: vivo@uqam.ca
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ca.uqam.tool.vivoproxy.swagger.client.api;

import ca.uqam.tool.vivoproxy.swagger.client.handler.ApiCallback;
import ca.uqam.tool.vivoproxy.swagger.client.handler.ApiClient;
import ca.uqam.tool.vivoproxy.swagger.client.handler.ApiException;
import ca.uqam.tool.vivoproxy.swagger.client.handler.ApiResponse;
import ca.uqam.tool.vivoproxy.swagger.client.handler.Configuration;
import ca.uqam.tool.vivoproxy.swagger.client.handler.Pair;
import ca.uqam.tool.vivoproxy.swagger.client.handler.ProgressRequestBody;
import ca.uqam.tool.vivoproxy.swagger.client.handler.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ca.uqam.tool.vivoproxy.swagger.client.model.Vivo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VivoApi {
    private ApiClient apiClient;

    public VivoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VivoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getindividualByIRI
     * @param IRI Used to obtain information from a VIVO individual by the IRI (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getindividualByIRICall(String IRI, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vivo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (IRI != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("IRI", IRI));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/plain", "application/rdf+xml", "text/n3", "text/turtle", "text/funtional", "text/manchester", "application/owl+xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getindividualByIRIValidateBeforeCall(String IRI, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'IRI' is set
        if (IRI == null) {
            throw new ApiException("Missing the required parameter 'IRI' when calling getindividualByIRI(Async)");
        }
        

        com.squareup.okhttp.Call call = getindividualByIRICall(IRI, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an individual by IRI
     * 
     * @param IRI Used to obtain information from a VIVO individual by the IRI (required)
     * @return Vivo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Vivo getindividualByIRI(String IRI) throws ApiException {
        ApiResponse<Vivo> resp = getindividualByIRIWithHttpInfo(IRI);
        return resp.getData();
    }

    /**
     * Get an individual by IRI
     * 
     * @param IRI Used to obtain information from a VIVO individual by the IRI (required)
     * @return ApiResponse&lt;Vivo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Vivo> getindividualByIRIWithHttpInfo(String IRI) throws ApiException {
        com.squareup.okhttp.Call call = getindividualByIRIValidateBeforeCall(IRI, null, null);
        Type localVarReturnType = new TypeToken<Vivo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an individual by IRI (asynchronously)
     * 
     * @param IRI Used to obtain information from a VIVO individual by the IRI (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getindividualByIRIAsync(String IRI, final ApiCallback<Vivo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getindividualByIRIValidateBeforeCall(IRI, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Vivo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
