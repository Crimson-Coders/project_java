package task.tree.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;




public class Task_Tree_Activity extends Activity{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button taskHelpButton;
        final Button callHelpButton;
        final Button loginButton;
        final Button breakButton;
        final TextView mainText;
        
       
        taskHelpButton = (Button)this.findViewById(R.id.taskHelp);
        callHelpButton = (Button)this.findViewById(R.id.callHelp);
        loginButton = (Button)this.findViewById(R.id.login);
        breakButton = (Button)this.findViewById(R.id.breakButton);
        mainText = (TextView)this.findViewById(R.id.textView1);
        
        taskHelpButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mainText.setText("TaskHelp Clicked");
			}
		});
        
        callHelpButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mainText.setText("CallHelp Clicked");
			}
		});
        
        loginButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mainText.setText("Login Clicked");
			}
		});
        
        breakButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mainText.setText("Break Clicked");
			}
		});
    }
    
}
