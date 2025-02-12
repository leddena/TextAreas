//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TextArea textArea = new TextArea("Default text");
        Button showLong = new Button("It gets long");
        showLong.setOnAction(_ -> {
            textArea.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        });

        Button changingArea = new Button("It has depth");
        changingArea.setOnAction(_ -> {

textArea.setText("wiggle\n" +
        "wiggle\n" +
        " wiggle\n" +
        "   wiggle\n" +
        "      wiggle\n" +
        "          wiggle\n" +
        "              wiggle\n" +
        "                  wiggle\n" +
        "                      wiggle\n" +
        "                          wiggle\n" +
        "                               wiggle\n" +
        "                                  wiggle\n" +
        "                                      wiggle\n" +
        "                                        wiggle\n" +
        "                                          wiggle\n" +
        "                                           wiggle\n" +
        "                                           wiggle\n" +
        "                                           wiggle\n" +
        "                                         wiggle\n" +
        "                                       wiggle\n" +
        "                                    wiggle\n" +
        "                                wiggle\n" +
        "                            wiggle\n" +
        "                        wiggle\n" +
        "                    wiggle\n" +
        "               wiggle\n" +
        "           wiggle\n" +
        "        wiggle\n" +
        "    wiggle\n" +
        "  wiggle\n" +
        "wiggle\n" +
        "wiggle\n" +
        "wiggle\n" +
        " wiggle\n" +
        "  wiggle\n" +
        "     wiggle\n" +
        "        wiggle\n" +
        "            wiggle\n" +
        "                wiggle\n" +
        "                    wiggle\n" +
        "                         wiggle\n" +
        "                             wiggle\n" +
        "                                 wiggle\n" +
        "                                    wiggle\n" +
        "                                       wiggle\n" +
        "                                          wiggle\n" +
        "                                           wiggle\n" +
        "                                           wiggle\n" +
        "                                           wiggle\n" +
        "                                          wiggle\n" +
        "                                        wiggle\n" +
        "                                     wiggle\n" +
        "                                  wiggle\n" +
        "                              wiggle\n" +
        "                          wiggle\n" +
        "                     wiggle\n" +
        "                 wiggle\n" +
        "             wiggle\n" +
        "         wiggle\n" +
        "      wiggle\n" +
        "   wiggle\n" +
        " wiggle\n" +
        "wiggle\n" +
        "wiggle\n" +
        "wiggle\n" +
        "  wiggle\n" +
        "    wiggle\n" +
        "       wiggle\n" +
        "          wiggle\n" +
        "              wiggle\n" +
        "                  wiggle\n" +
        "                       wiggle\n" +
        "                           wiggle\n" +
        "                               wiggle\n" +
        "                                   wiggle\n" +
        "                                      wiggle\n" +
        "                                         wiggle\n" +
        "                                          wiggle\n" +
        "                                           wiggle\n" +
        "                                           wiggle\n" +
        "                                           wiggle\n" +
        "                                         wiggle\n" +
        "                                      wiggle\n" +
        "                                   wiggle\n" +
        "                                wiggle\n" +
        "                            wiggle\n" +
        "                       wiggle\n" +
        "                   wiggle\n" +
        "               wiggle\n" +
        "           wiggle\n" +
        "       wiggle\n" +
        "    wiggle\n" +
        "  wiggle\n" +
        "wiggle\n" +
        "wiggle\n" +
        "wiggle\n" +
        " wiggle\n" +
        "   wiggle\n" +
        "     wiggle\n" +
        "         wiggle\nwiggle\n" +
        "wiggle\n" +
        " wiggle\n" +
        "   wiggle\n" +
        "      wiggle\n" +
        "          wiggle\n" +
        "              wiggle\n" +
        "                  wiggle\n" +
        "                      wiggle\n" +
        "                          wiggle\n" +
        "                               wiggle\n" +
        "                                  wiggle\n" +
        "                                      wiggle\n" +
        "                                        wiggle\n" +
        "                                          wiggle\n" +
        "                                           wiggle\n" +
        "                                           wiggle\n" +
        "                                           wiggle\n" +
        "                                         wiggle\n" +
        "                                       wiggle\n" +
        "                                    wiggle\n" +
        "                                wiggle\n" +
        "                            wiggle\n" +
        "                        wiggle\n" +
        "                    wiggle\n" +
        "               wiggle\n" +
        "           wiggle\n" +
        "        wiggle\n" +
        "    wiggle\n" +
        "  wiggle\n" +
        "wiggle\n" +
        "wiggle\n" +
        "wiggle\n" +
        " wiggle\n" +
        "  wiggle\n" +
        "     wiggle\n" +
        "        wiggle\n" +
        "            wiggle\n" +
        "                wiggle\n" +
        "                    wiggle\n" +
        "                         wiggle\n" +
        "                             wiggle\n" +
        "                                 wiggle\n" +
        "                                    wiggle\n" +
        "                                       wiggle\n" +
        "                                          wiggle\n" +
        "                                           wiggle\n" +
        "                                           wiggle\n" +
        "                                           wiggle\n" +
        "                                          wiggle\n" +
        "                                        wiggle\n" +
        "                                     wiggle\n" +
        "                                  wiggle\n" +
        "                              wiggle\n" +
        "                          wiggle\n" +
        "                     wiggle\n" +
        "                 wiggle\n" +
        "             wiggle\n" +
        "         wiggle\n" +
        "      wiggle\n" +
        "   wiggle\n" +
        " wiggle\n" +
        "wiggle\n" +
        "wiggle\n" +
        "wiggle\n" +
        "  wiggle\n" +
        "    wiggle\n" +
        "       wiggle\n" +
        "          wiggle\n" +
        "              wiggle\n" +
        "                  wiggle\n" +
        "                       wiggle\n" +
        "                           wiggle\n" +
        "                               wiggle\n" +
        "                                   wiggle\n" +
        "                                      wiggle\n" +
        "                                         wiggle\n" +
        "                                          wiggle\n" +
        "                                           wiggle\n" +
        "                                           wiggle\n" +
        "                                           wiggle\n" +
        "                                         wiggle\n" +
        "                                      wiggle\n" +
        "                                   wiggle\n" +
        "                                wiggle\n" +
        "                            wiggle\n" +
        "                       wiggle\n" +
        "                   wiggle\n" +
        "               wiggle\n" +
        "           wiggle\n" +
        "       wiggle\n" +
        "    wiggle\n" +
        "  wiggle\n" +
        "wiggle\n" +
        "wiggle\n" +
        "wiggle\n" +
        " wiggle\n" +
        "   wiggle\n" +
        "     wiggle\n" +
        "         wiggle\n");
        });

        Button setWrap = new Button("You can add a wrap");
        setWrap.setOnAction(_ -> {

            textArea.setWrapText(true);

        });

        Button addColumns = new Button("You can set the size");
        addColumns.setOnAction(_ -> {

            textArea.setPrefRowCount(5);
            textArea.setPrefColumnCount(3);
        });


        VBox vBox = new VBox();
        HBox hBox = new HBox();
        hBox.getChildren().addAll(showLong, changingArea, setWrap, addColumns);
        vBox.getChildren().addAll(textArea, hBox);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.setTitle("TextArea Presentation");
        stage.show();



    }
}