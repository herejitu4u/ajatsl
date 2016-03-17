package com.carapp.util;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONObject;

import android.util.Log;
import android.widget.TextView;

import com.carapp.activity.CustResonForVisitList;
import com.example.carappnew.R;

public class UploadDataInfo {
	public static  String strBranch, strSaleperson, strCustomer, strContactNo, strAddress,
	strMake, strModel, strYear, strOdomstrer, strRegistration, strDate,
	strTime;
	
	public static String 
    tyer_condition_lf,      tyer_condition_lb,       tyer_condition_rf,      tyer_condition_rb,
    tyre_size_lf,           tyre_size_lb,            tyre_size_rf,           tyre_size_rb,
    tyre_depth_lfx,         tyre_depth_lbx,          tyre_depth_rfx,          tyre_depth_rbx,
	tyre_depth_lfy,         tyre_depth_lby,          tyre_depth_rfy,          tyre_depth_rby,
    brake_pad_lf,           brake_pad_lb,            brake_pad_rf,           brake_pad_rb, 
    brake_disk_lf,          brake_disk_lb,           brake_disk_rf,          brake_disk_rb,
    shocker_lf,             shocker_lb,              shocker_rf,             shocker_rb, 
    wheel_lf,               wheel_lb,                wheel_rf,               wheel_rb,
	physical_damage_lf,     physical_damage_lb,      physical_damage_rf,     physical_damage_rb, 
	
	           immoblizer_f,         spare_wheel_b,
                 battery_f,            lock_nut_b,  
            physical_damage_f,    physical_damage_b;
	 
	public static ArrayList<String>  datacust_reson_for_visit,datadealer_recomendation,
	datacust_approved_work;
	public static String[] CustResonForVisitList,dealer_recommendations,cust_approved_work;
	public static String radiodata,Quotation1,Quotation2;
	public static String serverData;

	public static String company,email;                       
	
	//public static String FF, FL,FM,FR,FSL,FSR,BSL,BSR,BL,BM,BR;
	
	public static String observations,wheel_nuts_torqued,wheels_cleaned,wheels_balanced,
	alignment_done,tyre_pressure_front,tyre_pressure_back,tyres_polished,lock_nut_returned,
	car_tested_by_salesperson,work_inspected_by_salesperson,work_approved_by_salesperson,
	customer_satisfied;

	
	public static String tyre_depth_lf ,tyre_depth_lb ,tyre_depth_rf ,tyre_depth_rb; 
	
	@Override
	public String toString() {
		return "UploadDataInfo []";
	}
public static void parseData(String response) {
	try {
		
		JSONObject jsonObject2=new JSONObject(response);
		JSONObject jsonObject=jsonObject2.getJSONObject("registration");
		
		strBranch=jsonObject.optString("branch");
		strSaleperson=jsonObject.optString("salesperson");
		strCustomer=jsonObject.optString("customer");
		strContactNo=jsonObject.optString("contact_number");
		company=jsonObject.optString("company");
		email=jsonObject.optString("email");
		strAddress=jsonObject.optString("address");
		strMake=jsonObject.optString("make");
		strModel=jsonObject.optString("model");
		strYear=jsonObject.optString("year");
		strRegistration=jsonObject.optString("reg_plate_no");
		strDate=jsonObject.optString("date");
		strTime=jsonObject.optString("time");
		
		
		 JSONObject jsonObject1=jsonObject2.getJSONObject("vc");
		
		 tyer_condition_lf =jsonObject1.optString("tyre_condition_lf");
		 tyer_condition_lb =jsonObject1.optString("tyre_condition_lb");
		 tyer_condition_rf=jsonObject1.optString("tyre_condition_rf");
		 tyer_condition_rb=jsonObject1.optString("tyre_condition_rb");
		 
		 
		 tyre_size_lf=jsonObject1.optString("tyre_size_lf");
		 tyre_size_lb =jsonObject1.optString("tyre_size_lb");
		
		 brake_pad_lf=jsonObject1.optString("brake_pad_lf");
		 brake_disk_lf =jsonObject1.optString("brake_disk_lf");
		 
		 
		 shocker_lf=jsonObject1.optString("shocker_lf");
		 wheel_lf=jsonObject1.optString("wheel_lf");
		 
		
		 
		 physical_damage_lf =jsonObject1.optString("ph_damage_lf");
		 physical_damage_rb=jsonObject1.optString("ph_damage_rb");
		 physical_damage_lb=jsonObject1.optString("ph_damage_lb");
		 physical_damage_rf=jsonObject1.optString("ph_damage_rf");
		 physical_damage_f=jsonObject1.optString("ir_by_ph_damage");
		 physical_damage_b=jsonObject1.optString("sw_ln_ph_damage");
		 
		
		 brake_pad_lb =jsonObject1.optString("brake_pad_lb");
		brake_disk_lb=jsonObject1.optString("brake_disk_lb");
		shocker_lb=jsonObject1.optString("shocker_lb");
		wheel_lb=jsonObject1.optString("wheel_lb");
		
		
		tyre_size_rf=jsonObject1.optString("tyre_size_rf");
		tyre_depth_rfx=jsonObject1.optString("tyre_depth_rfx");
		tyre_depth_rfy=jsonObject1.optString("tyre_depth_rfy");
		brake_pad_rf=jsonObject1.optString("brake_pad_rf");
		brake_disk_rf=jsonObject1.optString("brake_disk_rf");
		shocker_rf=jsonObject1.optString("shocker_rf");
		wheel_rf=jsonObject1.optString("wheel_rf");
		
		
		tyre_size_rb=jsonObject1.optString("tyre_size_rb");
		tyre_depth_rbx=jsonObject1.optString("tyre_depth_rbx");
		tyre_depth_rby=jsonObject1.optString("tyre_depth_rby");
		brake_pad_rb=jsonObject1.optString("brake_pad_rb");
		brake_disk_rb=jsonObject1.optString("brake_disk_rb");
		shocker_rb=jsonObject1.optString("shocker_rb");
		wheel_rb=jsonObject1.optString("wheel_rb");
		
		
		tyre_depth_lf =jsonObject1.optString("wheel_rb");
		tyre_depth_lb =jsonObject1.optString("tyre_depth_lb");
	   tyre_depth_rf =jsonObject1.optString("tyre_depth_rf");
       tyre_depth_rb =jsonObject1.optString("tyre_depth_rb");
		
		
		immoblizer_f=jsonObject1.optString("immoblizer");
		battery_f=jsonObject1.optString("battery");
		
		spare_wheel_b=jsonObject1.optString("spare_wheel");
		lock_nut_b=jsonObject1.optString("lock_nut");
		
		
		
		 JSONObject jsonObject11=jsonObject2.getJSONObject("service_sheet");
		
		CustResonForVisitList=jsonObject11.optString("cust_visit_reason").split(",");  
		dealer_recommendations=jsonObject11.optString("dealer_recommendations").split(","); 
		cust_approved_work=jsonObject11.optString("cust_approved_work").split(",");
	    radiodata=jsonObject11.optString("radiodata");
		observations=jsonObject11.optString("observations"); 
	    wheel_nuts_torqued=jsonObject11.optString("wheel_nuts_torqued");  
		wheels_cleaned=jsonObject11.optString("wheels_cleaned"); 
	    wheels_balanced=jsonObject11.optString("wheels_balanced");
	    alignment_done=jsonObject11.optString("alignment_done"); 
	    tyre_pressure_front=jsonObject11.optString("tyre_pressure_front"); 
	    tyre_pressure_back=jsonObject11.optString("tyre_pressure_back"); 
	    tyres_polished=jsonObject11.optString("tyres_polished"); 
	    lock_nut_returned=jsonObject11.optString("lock_nut_returned"); 
	    car_tested_by_salesperson=jsonObject11.optString("car_tested_by_salesperson"); 
	    work_inspected_by_salesperson=jsonObject11.optString("work_inspected_by_salesperson"); 
	    work_approved_by_salesperson=jsonObject11.optString("work_approved_by_salesperson");  
	    customer_satisfied=jsonObject11.optString("customer_satisfied"); 
	    Quotation1=jsonObject11.optString("quotation1");  
	    Quotation2=jsonObject11.optString("quotation2"); 
	    
	    Log.e("observations",""+UploadDataInfo.observations);
		Log.e("wheel_nuts_torqued",""+UploadDataInfo.wheel_nuts_torqued);
		Log.e("wheels_cleaned",""+UploadDataInfo.wheels_cleaned);
		Log.e("wheels_balanced",""+UploadDataInfo.wheels_balanced);
		Log.e("alignment_done",""+UploadDataInfo.alignment_done);
		Log.e("tyre_pressure_front",""+UploadDataInfo.tyre_pressure_front);
		Log.e("tyre_pressure_back",""+UploadDataInfo.tyre_pressure_back);
		Log.e("tyres_polished",""+UploadDataInfo.tyres_polished);
		Log.e("lock_nut_returned",""+UploadDataInfo.lock_nut_returned);
		Log.e("car_tested_by_salesperson",""+UploadDataInfo.car_tested_by_salesperson);
		Log.e("work_inspected_by_salesperson",""+UploadDataInfo.work_inspected_by_salesperson);
		Log.e("work_approved_by_salesperson",""+UploadDataInfo.work_approved_by_salesperson);
		Log.e("customer_satisfied",""+UploadDataInfo.customer_satisfied); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	
}
