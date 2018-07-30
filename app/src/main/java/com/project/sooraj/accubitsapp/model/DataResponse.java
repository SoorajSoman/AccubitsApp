
package com.project.sooraj.accubitsapp.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataResponse {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("total")
    @Expose
    private Integer total;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataResponse() {
    }

    /**
     * 
     * @param total
     * @param data
     * @param success
     */
    public DataResponse(Boolean success, List<Datum> data, Integer total) {
        super();
        this.success = success;
        this.data = data;
        this.total = total;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
