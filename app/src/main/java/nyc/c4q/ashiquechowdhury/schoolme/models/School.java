package nyc.c4q.ashiquechowdhury.schoolme.models;

import android.os.Parcel;
import android.os.Parcelable;

public class School implements Parcelable {

    private String school_name;
    private String school_type;
    private String addtl_info1;
    private String addtl_info2;
    private String advancedplacement_courses;
    private String overview_paragraph;
    private String start_time;
    private String end_time;
    private String program_highlights;
    private String sport_boys;
    private String sport_girls;
    private String language_classes;
    private String extracurricular_activities;
    private String grade_span_min;
    private String grade_span_max;
    private String total_students;
    private String partner_hospital;
    private String primary_address_line_1;
    private String zip;
    private String boro;
    private String phone_number;
    private String school_email;
    private String website;
    private String ell_program;
    private String bus;
    private String subway;

    //Constructors
    public School() {
    }

    public School(String school_name, String school_type, String addtl_info1, String advancedplacement_courses, String start_time, String end_time, String program_highlights, String sport_boys, String sport_girls, String language_classes, String extracurricular_activities, String grade_span_min, String grade_span_max, String total_students, String partner_hospital, String primary_address_line_1, String zip, String boro, String phone_number, String school_email, String website, String ell_program, String bus, String subway) {
        this.school_name = school_name;
        this.school_type = school_type;
        this.addtl_info1 = addtl_info1;
        this.advancedplacement_courses = advancedplacement_courses;
        this.start_time = start_time;
        this.end_time = end_time;
        this.program_highlights = program_highlights;
        this.sport_boys = sport_boys;
        this.sport_girls = sport_girls;
        this.language_classes = language_classes;
        this.extracurricular_activities = extracurricular_activities;
        this.grade_span_min = grade_span_min;
        this.grade_span_max = grade_span_max;
        this.total_students = total_students;
        this.partner_hospital = partner_hospital;
        this.primary_address_line_1 = primary_address_line_1;
        this.zip = zip;
        this.boro = boro;
        this.phone_number = phone_number;
        this.school_email = school_email;
        this.website = website;
        this.ell_program = ell_program;
        this.bus = bus;
        this.subway = subway;
    }

    //Getters

    public School(String s) {
        this.school_name = s;
    }


    protected School(Parcel in) {
        school_name = in.readString();
        school_type = in.readString();
        addtl_info1 = in.readString();
        addtl_info2 = in.readString();
        advancedplacement_courses = in.readString();
        overview_paragraph = in.readString();
        start_time = in.readString();
        end_time = in.readString();
        program_highlights = in.readString();
        sport_boys = in.readString();
        sport_girls = in.readString();
        language_classes = in.readString();
        extracurricular_activities = in.readString();
        grade_span_min = in.readString();
        grade_span_max = in.readString();
        total_students = in.readString();
        partner_hospital = in.readString();
        primary_address_line_1 = in.readString();
        zip = in.readString();
        boro = in.readString();
        phone_number = in.readString();
        school_email = in.readString();
        website = in.readString();
        ell_program = in.readString();
        bus = in.readString();
        subway = in.readString();
    }

    public static final Creator<School> CREATOR = new Creator<School>() {
        @Override
        public School createFromParcel(Parcel in) {
            return new School(in);
        }

        @Override
        public School[] newArray(int size) {
            return new School[size];
        }
    };

    public String getSchool_name() {
        return school_name;
    }

    public String getSchool_type() {
        return school_type;
    }

    public String getAddtl_info1() {
        return addtl_info1;
    }

    public String getAdvancedplacement_courses() {
        return advancedplacement_courses;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public String getProgram_highlights() {
        return program_highlights;
    }

    public String getSport_boys() {
        return sport_boys;
    }

    public String getSport_girls() {
        return sport_girls;
    }

    public String getLanguage_classes() {
        return language_classes;
    }

    public String getExtracurricular_activities() {
        return extracurricular_activities;
    }

    public String getGrade_span_min() {
        return grade_span_min;
    }

    public String getGrade_span_max() {
        return grade_span_max;
    }

    public String getTotal_students() {
        return total_students;
    }

    public String getPartner_hospital() {
        return partner_hospital;
    }

    public String getPrimary_address_line_1() {
        return primary_address_line_1;
    }

    public String getZip() {
        return zip;
    }

    public String getBoro() {
        return boro;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getSchool_email() {
        return school_email;
    }

    public String getWebsite() {
        return website;
    }

    public String getEll_program() {
        return ell_program;
    }

    public String getBus() {
        return bus;
    }

    public String getSubway() {
        return subway;
    }

    public String getAddtl_info2() {
        return addtl_info2;
    }


    // Setters
    public void setAddtl_info2(String addtl_info2) {
        this.addtl_info2 = addtl_info2;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public void setSchool_type(String school_type) {
        this.school_type = school_type;
    }

    public void setAddtl_info1(String addtl_info1) {
        this.addtl_info1 = addtl_info1;
    }

    public void setAdvancedplacement_courses(String advancedplacement_courses) {
        this.advancedplacement_courses = advancedplacement_courses;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setProgram_highlights(String program_highlights) {
        this.program_highlights = program_highlights;
    }

    public void setSport_boys(String sport_boys) {
        this.sport_boys = sport_boys;
    }

    public void setSport_girls(String sport_girls) {
        this.sport_girls = sport_girls;
    }

    public void setLanguage_classes(String language_classes) {
        this.language_classes = language_classes;
    }

    public void setExtracurricular_activities(String extracurricular_activities) {
        this.extracurricular_activities = extracurricular_activities;
    }

    public void setGrade_span_min(String grade_span_min) {
        this.grade_span_min = grade_span_min;
    }

    public void setGrade_span_max(String grade_span_max) {
        this.grade_span_max = grade_span_max;
    }

    public void setTotal_students(String total_students) {
        this.total_students = total_students;
    }

    public void setPartner_hospital(String partner_hospital) {
        this.partner_hospital = partner_hospital;
    }

    public void setPrimary_address_line_1(String primary_address_line_1) {
        this.primary_address_line_1 = primary_address_line_1;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setBoro(String boro) {
        this.boro = boro;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setSchool_email(String school_email) {
        this.school_email = school_email;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setEll_program(String ell_program) {
        this.ell_program = ell_program;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    public String getOverview_paragraph() {
        return overview_paragraph;
    }

    public void setOverview_paragraph(String overview_paragraph) {
        this.overview_paragraph = overview_paragraph;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(school_name);
        parcel.writeString(school_type);
        parcel.writeString(addtl_info1);
        parcel.writeString(addtl_info2);
        parcel.writeString(advancedplacement_courses);
        parcel.writeString(overview_paragraph);
        parcel.writeString(start_time);
        parcel.writeString(end_time);
        parcel.writeString(program_highlights);
        parcel.writeString(sport_boys);
        parcel.writeString(sport_girls);
        parcel.writeString(language_classes);
        parcel.writeString(extracurricular_activities);
        parcel.writeString(grade_span_min);
        parcel.writeString(grade_span_max);
        parcel.writeString(total_students);
        parcel.writeString(partner_hospital);
        parcel.writeString(primary_address_line_1);
        parcel.writeString(zip);
        parcel.writeString(boro);
        parcel.writeString(phone_number);
        parcel.writeString(school_email);
        parcel.writeString(website);
        parcel.writeString(ell_program);
        parcel.writeString(bus);
        parcel.writeString(subway);
    }
}

