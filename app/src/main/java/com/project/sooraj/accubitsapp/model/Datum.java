
package com.project.sooraj.accubitsapp.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "Data_table")
public class Datum {

    @SerializedName("_id")
    @Expose
    private String idunique;
    @PrimaryKey
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("day")
    @Expose
    private Integer day;
    @SerializedName("month")
    @Expose
    private Integer month;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("venue")
    @Expose
    private String venue;
    @SerializedName("buyin")
    @Expose
    private Integer buyin;
    @SerializedName("sat")
    @Expose
    private Integer sat;
    @SerializedName("Gtd")
    @Expose
    private String gtd;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("event")
    @Expose
    private String event;
    @SerializedName("game")
    @Expose
    private String game;
    @SerializedName("spts")
    @Expose
    private Integer spts;
    @SerializedName("Daily")
    @Expose
    private Integer daily;
    @SerializedName("FEUILLET")
    @Expose
    private String fEUILLET;
    @SerializedName("rake")
    @Expose
    private Integer rake;
    @SerializedName("chips")
    @Expose
    private Integer chips;
    @SerializedName("stars")
    @Expose
    private Integer stars;
    @SerializedName("dateISO")
    @Expose
    private String dateISO;
    @SerializedName("filterDateISO")
    @Expose
    private String filterDateISO;
    @SerializedName("FT_DATE_ISO")
    @Expose
    private String fTDATEISO;
    @SerializedName("late_reg")
    @Expose
    private String lateReg;
    @SerializedName("specif")
    @Expose
    private String specif;
    @SerializedName("FT_DATE")
    @Expose
    private String fTDATE;
    @SerializedName("nbrday")
    @Expose
    private Integer nbrday;
    @SerializedName("round_length")
    @Expose
    private String roundLength;
    @SerializedName("__v")
    @Expose
    private Integer v;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param rake
     * @param link
     * @param nbrday
     * @param date
     * @param id
     * @param fTDATE
     * @param time
     * @param event
     * @param name
     * @param spts
     * @param year
     * @param chips
     * @param roundLength
     * @param lateReg
     * @param fTDATEISO
     * @param game
     * @param venue
     * @param daily
     * @param fEUILLET
     * @param v
     * @param specif
     * @param idunique
     * @param sat
     * @param stars
     * @param dateISO
     * @param filterDateISO
     * @param month
     * @param day
     * @param gtd
     * @param buyin
     */
    public Datum(String idunique, Integer id, Integer day, Integer month, Integer year, String date, String time, String venue, Integer buyin, Integer sat, String gtd, String link, String name, String event, String game, Integer spts, Integer daily, String fEUILLET, Integer rake, Integer chips, Integer stars, String dateISO, String filterDateISO, String fTDATEISO, String lateReg, String specif, String fTDATE, Integer nbrday, String roundLength, Integer v) {
        super();
        this.idunique = idunique;
        this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.buyin = buyin;
        this.sat = sat;
        this.gtd = gtd;
        this.link = link;
        this.name = name;
        this.event = event;
        this.game = game;
        this.spts = spts;
        this.daily = daily;
        this.fEUILLET = fEUILLET;
        this.rake = rake;
        this.chips = chips;
        this.stars = stars;
        this.dateISO = dateISO;
        this.filterDateISO = filterDateISO;
        this.fTDATEISO = fTDATEISO;
        this.lateReg = lateReg;
        this.specif = specif;
        this.fTDATE = fTDATE;
        this.nbrday = nbrday;
        this.roundLength = roundLength;
        this.v = v;
    }

    public String getIdunique() {
        return idunique;
    }

    public void setIdunique(String idunique) {
        this.idunique = idunique;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Integer getBuyin() {
        return buyin;
    }

    public void setBuyin(Integer buyin) {
        this.buyin = buyin;
    }

    public Integer getSat() {
        return sat;
    }

    public void setSat(Integer sat) {
        this.sat = sat;
    }

    public String getGtd() {
        return gtd;
    }

    public void setGtd(String gtd) {
        this.gtd = gtd;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public Integer getSpts() {
        return spts;
    }

    public void setSpts(Integer spts) {
        this.spts = spts;
    }

    public Integer getDaily() {
        return daily;
    }

    public void setDaily(Integer daily) {
        this.daily = daily;
    }

    public String getFEUILLET() {
        return fEUILLET;
    }

    public void setFEUILLET(String fEUILLET) {
        this.fEUILLET = fEUILLET;
    }

    public Integer getRake() {
        return rake;
    }

    public void setRake(Integer rake) {
        this.rake = rake;
    }

    public Integer getChips() {
        return chips;
    }

    public void setChips(Integer chips) {
        this.chips = chips;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public String getDateISO() {
        return dateISO;
    }

    public void setDateISO(String dateISO) {
        this.dateISO = dateISO;
    }

    public String getFilterDateISO() {
        return filterDateISO;
    }

    public void setFilterDateISO(String filterDateISO) {
        this.filterDateISO = filterDateISO;
    }

    public String getFTDATEISO() {
        return fTDATEISO;
    }

    public void setFTDATEISO(String fTDATEISO) {
        this.fTDATEISO = fTDATEISO;
    }

    public String getLateReg() {
        return lateReg;
    }

    public void setLateReg(String lateReg) {
        this.lateReg = lateReg;
    }

    public String getSpecif() {
        return specif;
    }

    public void setSpecif(String specif) {
        this.specif = specif;
    }

    public String getFTDATE() {
        return fTDATE;
    }

    public void setFTDATE(String fTDATE) {
        this.fTDATE = fTDATE;
    }

    public Integer getNbrday() {
        return nbrday;
    }

    public void setNbrday(Integer nbrday) {
        this.nbrday = nbrday;
    }

    public String getRoundLength() {
        return roundLength;
    }

    public void setRoundLength(String roundLength) {
        this.roundLength = roundLength;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

}
