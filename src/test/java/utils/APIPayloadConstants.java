package utils;

import org.json.JSONObject;

public class APIPayloadConstants {

    public static String createEmployeePayload(){
       String createEmployeePayloadVariable =
       "{\n" +
               "  \"emp_firstname\": \"shobha\",\n" +
               "  \"emp_lastname\": \"GB\",\n" +
               "  \"emp_middle_name\": \"MS\",\n" +
               "  \"emp_gender\": \"F\",\n" +
               "  \"emp_birthday\": \"2022-06-13\",\n" +
               "  \"emp_status\": \"Probation\",\n" +
               "  \"emp_job_title\": \"QA\"\n" +
               "}";

       return createEmployeePayloadVariable;
    }

    public static String createEmployeePayloadJson(){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "shobha");
        obj.put("emp_lastname", "GB");
        obj.put("emp_middle_name", "MS");
        obj.put("emp_gender", "F");
        obj.put("emp_birthday", "2022-06-13");
        obj.put("emp_status", "Probation");
        obj.put("emp_job_title", "QA");
        return obj.toString();
    }

    public static String dynamicPayload(String emp_firstname, String emp_lastname,
                                        String emp_middle_name, String emp_gender,
                                        String emp_birthday, String emp_status,
                                        String emp_job_title){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", emp_firstname);
        obj.put("emp_lastname", emp_lastname);
        obj.put("emp_middle_name", emp_middle_name);
        obj.put("emp_gender", emp_gender);
        obj.put("emp_birthday", emp_birthday);
        obj.put("emp_status", emp_status);
        obj.put("emp_job_title", emp_job_title);
        return obj.toString();
    }



}
