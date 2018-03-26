package com.example.ntnam.timepicker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WorkTime  {
    private String title;
    private String content;
    private Date dateFinish;
    private Date hourFinish;
    //get-set Title
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    //get-set Content
    public String getContent(){
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    //get-set DateFinish
    public Date getDateFinish(){
        return this.dateFinish;
    }
    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    //get-set HourFinish
    public Date getHourFinishh(){
        return this.hourFinish;
    }
    public void setHourFinish(Date hourFinish) {
        this.hourFinish = hourFinish;
    }

    public WorkTime(String title,String content,Date dateFinish,Date hourFinish){
        this.title = title;
        this.content = content;
        this.dateFinish = dateFinish;
        this.hourFinish = hourFinish;
    }

    public WorkTime() {
        super();
    }

    /**
     * get date format
     * @param d
     * @return
     */
    public String getDateFormat(Date d)
    {
        SimpleDateFormat dft=new
                SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        return dft.format(d);
    }

    /**
     * get time format
     * @param d
     * @return
     */
    public String getHourFormat(Date d)
    {
        SimpleDateFormat dft=new
                SimpleDateFormat("hh:mm a", Locale.getDefault());
        return dft.format(d);
    }
    @Override
    public String toString() {
        return this.title+"-"+
                getDateFormat(this.dateFinish)+"-"+
                getHourFormat(this.hourFinish);
    }

}
