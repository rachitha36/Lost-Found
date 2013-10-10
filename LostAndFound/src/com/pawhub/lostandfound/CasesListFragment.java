package com.pawhub.lostandfound;

import com.pawhub.lostandfound.transferobjects.AbuseReport;
import com.pawhub.lostandfound.transferobjects.AccidentReport;
import com.pawhub.lostandfound.transferobjects.FoundReport;
import com.pawhub.lostandfound.transferobjects.HomelessReport;
import com.pawhub.lostandfound.transferobjects.LostReport;
import com.pawhub.lostandfound.transferobjects.Report;
import com.pawhub.lostandfound.views.ReportView;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class CasesListFragment extends Fragment{

	private final int SCREEN_HOME = 0;
	private final int SCREEN_ALERTS = 1;
	private final int SCREEN_REPORTS = 2;
	private final int SCREEN_LOST = 3;
	private final int SCREEN_FOUND = 4;
	private final int SCREEN_ABUSE = 5;
	private final int SCREEN_HOMELESS = 6;
	
	private LinearLayout parentLayout;
	private LayoutInflater inflater;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cases_list_layout, container, false);
    }
	
	@Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        parentLayout=(LinearLayout)getView().findViewById(R.id.layoutCasesList);
        inflater = (LayoutInflater) getActivity().getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        
        Bundle arguments=getArguments();
        initScreen(arguments);
    }
	
	private void initScreen(Bundle arguments){
		int screenType=arguments.getInt("TYPE");
		
		switch(screenType){
			case SCREEN_HOME:
				initScreenHome();
				break;
			case SCREEN_ALERTS:
				initScreenAlerts();
				break;
			case SCREEN_REPORTS:
				initScreenReports();
				break;
			case SCREEN_LOST:
				initScreenLosts();
				break;
			case SCREEN_FOUND:
				initScreenFound();
				break;
			case SCREEN_ABUSE:
				initScreenAbuse();
				break;
			case SCREEN_HOMELESS:
				initScreenHomeless();
				break;		
		}
	}
	
	
	private void initScreenHome(){
		AbuseReport report=new AbuseReport("ABCCD",Report.TYPE_DOG, "  ",null,
				"Este es un comentario acerca de la situacion", "sin comentario", false, 1234, false,"Irving");
		
		AbuseReport report2=new AbuseReport("ABCCD",Report.TYPE_DOG, "  ","c",
				"Este es un comentario acerca de la situacion", "sin comentario", true, 1234, false,"Emmanuel");
		
		AbuseReport report3=new AbuseReport("ABCCD",Report.TYPE_DOG, "  ","",
				"Este es un comentario acerca de la situacion", "sin comentario", false, 1234, true,"Gonzalez");
		
		AccidentReport report4=new AccidentReport("ABCCD", Report.TYPE_CAT, "", null,
				"Este es un comentario acerca de la situacion", false, 234, false, "Pedro Paramo");
		
		FoundReport report5 =new FoundReport("ADSFE", Report.TYPE_OTHER, "", null, 
				"Este es un comentario acerca de la situacion", 2, "rojo", "", false, 0, true, "Laura Bozo");
		
		LostReport report6 =new LostReport("ADASDASF", Report.TYPE_CAT, "", "d", 
				"Este es un comentario acerca de la situacion", "un año", 2,"azul", "gato",false, 456, false, "Irving Emmanuel");
		
		HomelessReport report7 =new HomelessReport("ASDA", Report.TYPE_DOG, "", null,
				"Este es un comentario acerca de la situacion", true, 23, true, "Paulina Rubio");
		
		
		
		parentLayout.addView(new ReportView(report, inflater).getReportChart());
		parentLayout.addView(new ReportView(report2, inflater).getReportChart());
		parentLayout.addView(new ReportView(report3, inflater).getReportChart());
		parentLayout.addView(new ReportView(report4, inflater).getReportChart());
		parentLayout.addView(new ReportView(report5, inflater).getReportChart());
		parentLayout.addView(new ReportView(report6, inflater).getReportChart());
		parentLayout.addView(new ReportView(report7, inflater).getReportChart());
	}
	
	private void initScreenAlerts(){
		
		
	}
	
	private void initScreenReports(){
		
	}
	
	private void initScreenLosts(){
		
	}
	
	private void initScreenAbuse(){
		
	}

	private void initScreenFound(){
		
	}
	
	private void initScreenHomeless(){
		
	}
	
}
