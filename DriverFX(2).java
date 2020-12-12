

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DriverFX extends Application {  
	/**
	 * The main method for the GUI JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		int main( )
		{
		    table test;    // A table that we'll perform tests on
		    char choice;                     // A command character entered by the user
		    bool found;                      // Value returned by find function
		    test_record_type result;         // Value returned by find function
		  
		    cout << "I have initialized an empty table. Each record in the table\n";
		    cout << "has an integer key and a real number as data." << endl;

		    do
		    {
		        print_menu( );
		        choice = toupper(get_user_command( ));
		        switch (choice)
		        {
		            case 'S': cout << "The table size is " << test.size( ) << endl;
		                      break;
		            case 'I': test.insert(get_record( ));
		                      cout << "The record has been inserted." << endl;
		                      break;
		            case 'R': test.remove(get_key( ));
		                      cout << "Remove has been called with that key." << endl;
		                      break;   
		            case '?': if (test.is_present(get_key( )))
		                          cout << "That key is present." << endl;
		                      else
		                          cout << "That key is not present." << endl;
		                      break;
		            case 'F': test.find(get_key( ), found, result);
		                      if (found)
		                          cout << "The key's data is: " << result.data << endl;
		                      else
		                          cout << "That key is not present." << endl;
		                      break;
		            case 'Q': cout << "Ridicule is the best test of truth." << endl;
		                      break;
		            default: cout << choice << " is invalid. Sorry." << endl;
		        }
		    }
		    while ((choice != 'Q'));

		    return EXIT_SUCCESS;
		}
		launch(args);   
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		//  instantiate the FXMainPane, name it root
		FXMainPane root = new FXMainPane();
		//  set the scene to hold root
		stage.setScene(new Scene(root, 600,700));
		//set stage title
		stage.setTitle("Travelling Student");
		//display the stage
		stage.show();
	
	}

}
