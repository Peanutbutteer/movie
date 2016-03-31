package com.nutstep.movie.dao;

/**
 * Created by peanutbutteer on 3/31/2016 AD.
 */

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Intheater {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("results")
    @Expose
    private List<MovieIntheaterResult> results = new ArrayList<MovieIntheaterResult>();
    @SerializedName("dates")
    @Expose
    private Dates dates;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;

    /**
     * @return The page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * @param page The page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * @return The results
     */
    public List<MovieIntheaterResult> getResults() {
        return results;
    }

    /**
     * @param results The results
     */
    public void setResults(List<MovieIntheaterResult> results) {
        this.results = results;
    }

    /**
     * @return The dates
     */
    public Dates getDates() {
        return dates;
    }

    /**
     * @param dates The dates
     */
    public void setDates(Dates dates) {
        this.dates = dates;
    }

    /**
     * @return The totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * @param totalPages The total_pages
     */
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * @return The totalResults
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * @param totalResults The total_results
     */
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

}
