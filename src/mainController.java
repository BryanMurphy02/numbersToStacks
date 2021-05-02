import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class mainController extends minecraft{
	
	int count = 1;
	ArrayList<String> names = new ArrayList<String>(10);
	ArrayList<String> stringNums = new ArrayList<String>(10);
	
	
	@FXML
    private Pane startPane;
	
	@FXML
    private Pane secondPane;
	
    @FXML
    private TextField nameOfItem;

    @FXML
    private TextField numOfItem;

    @FXML
    private Button enterNext;

    @FXML
    private Button done;
    
    @FXML
    private TableView<?> table;
    
    
    @FXML
    void enterNextClicked(MouseEvent event) {
    	
    	if(nameOfItem.getText() != "" && numOfItem.getText() != "") {
    		//gets the information typed in by user
        	names.add(nameOfItem.getText());
        	stringNums.add(numOfItem.getText());
        	
        	
        	//clears the text fields
        	nameOfItem.setText("");
        	numOfItem.setText("");
    	}
    	
    	
    	
    }


    @FXML
    void doneClicked(MouseEvent event) {
    	
    	//add last input to ArrayLists and clears
    	if(nameOfItem.getText() != "" && numOfItem.getText() != "") {
    		//gets the information typed in by user
        	names.add(nameOfItem.getText());
        	stringNums.add(numOfItem.getText());
        	
        	
        	//clears the text fields
        	nameOfItem.setText("");
        	numOfItem.setText("");
    	}
    	
    	//temp printing
    	convertToStack(stringNums);
    	zipData(names, stackList, remainingList);
    	for(int i = 0; i < master.size(); i++) {
    		System.out.println(master.get(i));
    	}
    	
    	
    	//change visibility of pane
//    	startPane.setVisible(false);
//    	secondPane.setVisible(true);
    	
    	//convert strings to integers
    	//convertToStack(stringNums);
    	
    	//add info to table
    	//printData(names, stackList, remainingList);
    	
    	
    	
    	
    }


	
    
    


    
}
