import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.application.Application; 
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  
import javafx.scene.layout.GridPane;
import javafx.stage.Stage; 




public class CompositorApp extends Application {  
    
    //private String AUDIO_URL = getClass().getResource("midis/alarme.mp3").toString();
   @Override 
   public void start(Stage stage) throws FileNotFoundException {  

      
      //Creating an image
      Image fechar = new Image(new FileInputStream("img/circulo.png"));
      
      //Setting the image view
      ImageView fecharView = new ImageView(fechar);
      
      //Setting the position of the image
      fecharView.setX(310);
      fecharView.setY(25);
      
      //setting the fit height and width of the image view 
      fecharView.setFitHeight(250);
      fecharView.setFitWidth(250);
      
      
      Melodia melodia = new Melodia();
      Alert alerta = new Alert(Alert.AlertType.INFORMATION);
      //alerta.setContentText(melodia.getNota());
      //alerta.showAndWait();
      
       GridPane rootNode = new GridPane();
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 200);

        rootNode.add(new Label("Inicial:"), 0, 0);
        TextField inicial = new TextField();
        rootNode.add(inicial, 1, 0);
                
        
        rootNode.add(new Label("Razão:"), 0, 1);
        TextField razao = new TextField();
        rootNode.add(razao, 1, 1);
        
        rootNode.add(new Label("Nº termos:"), 0, 2);
        TextField Ntermos = new TextField();
        rootNode.add(Ntermos, 1, 2);
        
        
        //Campo Result
        rootNode.add(new Label("Resultado:"), 0, 5);
        TextField result = new TextField(); 
        rootNode.add(result, 1, 5);
        result.setEditable(false);
        
        
        

        
        Button aButton = new Button("Executar");
        rootNode.add(aButton, 1, 4);
        GridPane.setHalignment(aButton, HPos.LEFT);
        
        

        aButton.setOnAction(e -> {
            Integer i = Integer.valueOf(inicial.getText());
            Integer r = Integer.valueOf(razao.getText());
            Integer n = Integer.valueOf(Ntermos.getText());
            //Integer termos = Integer.valueOf(Ntermos.getText());
            //Integer r = value1 + value2;
            //result.setText(r.toString());
            
            //Integer r = melodia.somaNota(Integer.valueOf(razao.getText()));
            //result.setText(r.toString());
            
            
            result.setText(melodia.pa(i, r, n));
            
            
            //result.setText();
            
        });
     
           
      

      
      
      
      //Creating a Group object  
      Group root = new Group(fecharView, rootNode);  
      
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 500) ;  
      
      
      
      //Setting title to the Stage 
      stage.setTitle("Loading an image") ;  
      
      //Adding scene to the stage 
      stage.setScene(scene) ;
      
      //Displaying the contents of the stage 
      stage.show() ; 
   }  
   public static void main(String args[]) { 
      launch(args) ; 
   } 
}