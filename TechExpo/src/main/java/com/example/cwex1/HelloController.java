package com.example.cwex1;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.util.Duration;

import java.io.*;
import java.net.URL;
import java.util.*;

public class HelloController implements Initializable {

    ObservableList<ProjectDetails> ProjectDetailsList = FXCollections.observableArrayList();

    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public Button btn3;
    @FXML
    public Button btn4;
    @FXML
    public Button btn5;
    @FXML
    public Button btn6;
    @FXML
    public Button btn7;
    @FXML
    public Button btnExit;
    @FXML
    public AnchorPane paneAdd;
    @FXML
    public TextField inputID;
    @FXML
    public TextField inputName;
    @FXML
    public TextField inputCat;
    @FXML
    public TextField inputTeam;
    @FXML
    public TextField inputDes;
    @FXML
    public TextField inputCountry;
    @FXML
    public ImageView imageView;
    @FXML
    public Button pickImageBtn;
    @FXML
    public Label labelAdd;
    @FXML
    public Button btnAdd_page;
    @FXML
    public TableView<ProjectDetails> AddTable;
    @FXML
    public TableColumn<ProjectDetails, Integer> AddPId;
    @FXML
    public TableColumn<ProjectDetails, String> AddPName;
    @FXML
    public TableColumn<ProjectDetails, String> AddPTeam;
    @FXML
    public TableColumn<ProjectDetails,String> AddPCat;
    @FXML
    public TableColumn<ProjectDetails, String> AddPDes;
    @FXML
    public TableColumn<ProjectDetails, String> AddPCountry;
    @FXML
    public TableColumn<ProjectDetails, Image> AddPLogo;
    @FXML
    public AnchorPane paneUpdate;
    @FXML
    public TextField inputSearchUpd;
    @FXML
    public Button searchBtnUpd;
    @FXML
    public Button updateImagePickBtn;
    @FXML
    public TextField inputUpdateID;
    @FXML
    public TextField inputUpdateName;
    @FXML
    public TextField InputUpdateCat;
    @FXML
    public TextField inputUpdateTeam;
    @FXML
    public TextField inputUpdateDes;
    @FXML
    public TextField inputUpdateCountry;
    @FXML
    public ImageView imageViewUpd;
    @FXML
    public Button btnUpdate_page;
    @FXML
    public TableView<ProjectDetails> tableUpdate;
    @FXML
    public TableColumn<ProjectDetails, Integer> updatePID;
    @FXML
    public TableColumn<ProjectDetails, String> updatePName;
    @FXML
    public TableColumn<ProjectDetails, String> updatePCat;
    @FXML
    public TableColumn<ProjectDetails, String> updatePTeam;
    @FXML
    public TableColumn<ProjectDetails, String> updatePDes;
    @FXML
    public TableColumn<ProjectDetails, String> updatePCountry;
    @FXML
    public TableColumn<ProjectDetails, Image> updatePLogo;
    @FXML
    public Label labelUpdate;
    @FXML
    public AnchorPane paneDelete;
    @FXML
    public Button serachBtnDel;
    @FXML
    public TextField inputSearchDel;
    @FXML
    public Button btnDelete_page;
    @FXML
    public TableView<ProjectDetails> tableDelete;
    @FXML
    public TableColumn<ProjectDetails, Integer> deletePID;
    @FXML
    public TableColumn<ProjectDetails, String> deletePName;
    @FXML
    public TableColumn<ProjectDetails, String> deletePCat;
    @FXML
    public TableColumn<ProjectDetails, String> deletePTeam;
    @FXML
    public TableColumn<ProjectDetails, String> deletePDes;
    @FXML
    public TableColumn<ProjectDetails, String> deletePCountry;
    @FXML
    public TableColumn<ProjectDetails, Image> deletePLogo;
    @FXML
    public Label labelDelete;
    @FXML
    public AnchorPane paneVPD;
    @FXML
    public Button sortBtn;
    @FXML
    public TableView<ProjectDetails> tableView;
    @FXML
    public TableColumn<ProjectDetails, Integer> ViewPID;
    @FXML
    public TableColumn<ProjectDetails, String> ViewPName;
    @FXML
    public TableColumn<ProjectDetails, String> ViewPCat;
    @FXML
    public TableColumn<ProjectDetails, String> ViewPTeam;
    @FXML
    public TableColumn<ProjectDetails, String> ViewPDes;
    @FXML
    public TableColumn<ProjectDetails, String> ViewPCountry;
    @FXML
    public TableColumn<ProjectDetails,Image> ViewPLogo;
    @FXML
    public Label sortLabel;
    @FXML
    public AnchorPane paneSPD;
    @FXML
    public Button saveBtn;
    @FXML
    public TableView<ProjectDetails> tableSave;
    @FXML
    public TableColumn<ProjectDetails,Integer> SavePID;
    @FXML
    public TableColumn<ProjectDetails,String> SavePName;
    @FXML
    public TableColumn<ProjectDetails, String> SavePCat;
    @FXML
    public TableColumn<ProjectDetails, String> SavePTeam;
    @FXML
    public TableColumn<ProjectDetails, String> SavePDes;
    @FXML
    public TableColumn<ProjectDetails, Image> SavePCountry;
    @FXML
    public AnchorPane paneSelectWinners;
    @FXML
    public Button SelectWinnersBtn;
    @FXML
    public Label WinnersLabel;
    @FXML
    public TextField InputPoint1;
    @FXML
    public TextField InputPoint2;
    @FXML
    public TextField InputPoint3;
    @FXML
    public TextField InputPoint4;
    @FXML
    public Button PointOkBtn;
    @FXML
    public Label Win2;
    @FXML
    public Label Win1;
    @FXML
    public Label Win3;
    @FXML
    public AnchorPane paneConfig;
    @FXML
    public Button btnADD;
    @FXML
    public Button btnUpdate;
    @FXML
    public Button btnDelete;
    @FXML
    public AnchorPane paneRandomSel;
    @FXML
    public Button RandomSelectBtn;
    @FXML
    public TableView<ProjectDetails> tableRandomProjects;
    @FXML
    public TableColumn<ProjectDetails,Integer> RandomPID;
    @FXML
    public TableColumn<ProjectDetails,String> RandomPName;
    @FXML
    public TableColumn<ProjectDetails,String> RandomPCat;
    @FXML
    public TableColumn<ProjectDetails, String> RandomPTeam;
    @FXML
    public TableColumn<ProjectDetails, String> RandomPDes;
    @FXML
    public TableColumn<ProjectDetails, String> RandomPCountry;
    @FXML
    public AnchorPane paneVisualize;
    @FXML
    public Button VisualizationBtn;
    @FXML
    public BarChart<String, Number> PointsChart;
    @FXML
    public AnchorPane paneHome;

    private boolean random_spotlight = false;
    private boolean gotwinners = false;

    private List<ProjectDetails> spotlightProjects;
    private int currentProjectIndex = 0;
    private Map<ProjectDetails, Integer> projectScores = new HashMap<>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Add table
        AddPId.setCellValueFactory(new PropertyValueFactory<>("P_ID"));
        AddPName.setCellValueFactory(new PropertyValueFactory<>("P_Name"));
        AddPCat.setCellValueFactory(new PropertyValueFactory<>("PCAT"));
        AddPTeam.setCellValueFactory(new PropertyValueFactory<>("P_Team"));
        AddPDes.setCellValueFactory(new PropertyValueFactory<>("P_Des"));
        AddPCountry.setCellValueFactory(new PropertyValueFactory<>("P_Country"));
        AddPLogo.setCellFactory(column -> new ImageTableCell<>(80));
        AddPLogo.setCellValueFactory(new PropertyValueFactory<>("Logo"));
        AddTable.setItems(ProjectDetailsList);

        //Update Table
        updatePID.setCellValueFactory(new PropertyValueFactory<>("P_ID"));
        updatePName.setCellValueFactory(new PropertyValueFactory<>("P_Name"));
        updatePCat.setCellValueFactory(new PropertyValueFactory<>("PCAT"));
        updatePTeam.setCellValueFactory(new PropertyValueFactory<>("P_Team"));
        updatePDes.setCellValueFactory(new PropertyValueFactory<>("P_Des"));
        updatePCountry.setCellValueFactory(new PropertyValueFactory<>("P_Country"));
        updatePLogo.setCellFactory(column -> new ImageTableCell<>(80));
        updatePLogo.setCellValueFactory(new PropertyValueFactory<>("Logo"));
        tableUpdate.setItems(ProjectDetailsList);

        //Delete Table
        deletePID.setCellValueFactory(new PropertyValueFactory<>("P_ID"));
        deletePName.setCellValueFactory(new PropertyValueFactory<>("P_Name"));
        deletePCat.setCellValueFactory(new PropertyValueFactory<>("PCAT"));
        deletePTeam.setCellValueFactory(new PropertyValueFactory<>("P_Team"));
        deletePDes.setCellValueFactory(new PropertyValueFactory<>("P_Des"));
        deletePCountry.setCellValueFactory(new PropertyValueFactory<>("P_Country"));
        deletePLogo.setCellFactory(column -> new ImageTableCell<>(80));
        deletePLogo.setCellValueFactory(new PropertyValueFactory<>("Logo"));
        tableDelete.setItems(ProjectDetailsList);

        //Save Table
        SavePID.setCellValueFactory(new PropertyValueFactory<>("P_ID"));
        SavePName.setCellValueFactory(new PropertyValueFactory<>("P_Name"));
        SavePCat.setCellValueFactory(new PropertyValueFactory<>("PCAT"));
        SavePTeam.setCellValueFactory(new PropertyValueFactory<>("P_Team"));
        SavePDes.setCellValueFactory(new PropertyValueFactory<>("P_Des"));
        SavePCountry.setCellValueFactory(new PropertyValueFactory<>("P_Country"));
        tableSave.setItems(ProjectDetailsList);

        //View Table
        ViewPID.setCellValueFactory(new PropertyValueFactory<>("P_ID"));
        ViewPName.setCellValueFactory(new PropertyValueFactory<>("P_Name"));
        ViewPCat.setCellValueFactory(new PropertyValueFactory<>("PCAT"));
        ViewPTeam.setCellValueFactory(new PropertyValueFactory<>("P_Team"));
        ViewPDes.setCellValueFactory(new PropertyValueFactory<>("P_Des"));
        ViewPCountry.setCellValueFactory(new PropertyValueFactory<>("P_Country"));
        ViewPLogo.setCellFactory(column -> new ImageTableCell<>(80));
        ViewPLogo.setCellValueFactory(new PropertyValueFactory<>("Logo"));
        tableView.setItems(ProjectDetailsList);

        // Initialize pane visibility
        paneHome.setVisible(true);
        paneConfig.setVisible(false);
        paneVPD.setVisible(false);
        paneSPD.setVisible(false);
        paneRandomSel.setVisible(false);
        paneSelectWinners.setVisible(false);
        paneVisualize.setVisible(false);
        paneAdd.setVisible(false);
        paneDelete.setVisible(false);
        paneUpdate.setVisible(false);
    }

    //Insert Logo For Add Details.
    public void logoImage(ActionEvent ignoredImage) {
        pickImageBtn.setOnAction(event -> {

            //Create file chooser
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select Image");

            File initialDirectory = new File(System.getProperty("user.home"));
            fileChooser.setInitialDirectory(initialDirectory);

            //Filter image modes
            FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.jpeg");
            fileChooser.getExtensionFilters().add(imageFilter);

            File selectedFile = fileChooser.showOpenDialog(pickImageBtn.getScene().getWindow());
            if (selectedFile != null) {
                Image P_Logo = new Image(selectedFile.toURI().toString());
                imageView.setImage(P_Logo);
            }
        });
    }

    //Insert Image for Update Details.
    public void updateimage(ActionEvent ignoredImageU) {
        updateImagePickBtn.setOnAction(event -> {

            //Create file chooser
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select Image");

            File initialDirectory = new File(System.getProperty("user.home"));
            fileChooser.setInitialDirectory(initialDirectory);

            //Filter image modes
            FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.jpeg");
            fileChooser.getExtensionFilters().add(imageFilter);

            File selectedFile = fileChooser.showOpenDialog(updateImagePickBtn.getScene().getWindow());
            if (selectedFile != null) {
                Image P_Logo = new Image(selectedFile.toURI().toString());
                imageViewUpd.setImage(P_Logo);
            }
        });
    }


    public void searchRecordUpd(ActionEvent ignoredSearchU) {
        String searchProjectId = inputSearchUpd.getText();
        try {
            int P_ID = Integer.parseInt(searchProjectId);
            ProjectDetails searchedproject = null;
            for (ProjectDetails Project : ProjectDetailsList) {
                if (Project.getP_ID() == P_ID) {
                    searchedproject = Project;
                    break;
                }
            }
            if (searchedproject != null) {
                // Remove the searched project from the list and add it to the top
                ProjectDetailsList.remove(searchedproject);
                ProjectDetailsList.addFirst(searchedproject);

                // Update table view
                tableUpdate.setItems(FXCollections.observableArrayList(ProjectDetailsList));

                // Refresh the table view to reflect the changes
                tableUpdate.refresh();
            } else {
                labelUpdate.setText("No Project With ID" + P_ID + "Found");
            }
        } catch (NumberFormatException e) {
            labelUpdate.setText("Invalid Input. Please enter a valid ID");
        }

    }


    public void searchRecordDel(ActionEvent ignoredSearch) {
        String searchProjectId = inputSearchDel.getText();
        try {
            int P_ID = Integer.parseInt(searchProjectId);
            ProjectDetails searchedproject = null;
            for (ProjectDetails Project : ProjectDetailsList) {
                if (Project.getP_ID() == P_ID) {
                    searchedproject = Project;
                    break;
                }
            }
            if (searchedproject != null) {
                // Remove the searched project from the list and add it to the top
                ProjectDetailsList.remove(searchedproject);
                ProjectDetailsList.addFirst(searchedproject);

                // Update table view
                tableUpdate.setItems(FXCollections.observableArrayList(ProjectDetailsList));

                // Refresh the table view to reflect the changes
                tableUpdate.refresh();
            } else {
                labelUpdate.setText("No Project With ID" + P_ID + "Found");
            }
        } catch (NumberFormatException e) {
            labelUpdate.setText("Invalid Input. Please enter a valid ID");
        }
    }

    //Capitalize First Letter In Each Word
    public String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder result = new StringBuilder(str.length());
        String[] words = str.split("\\s");
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
            }
            if (!(result.length() == str.length()))
                result.append(' ');
        }
        return result.toString();

    }

    //Switch Between Panes
    public void buttonClicksMain(ActionEvent actionEvent) {
        if(actionEvent.getSource() == btn1) {
            if(random_spotlight) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Random Selection For Spotlight Started");
                alert.setHeaderText(null);
                alert.setContentText("You Can't Add, Update or Delete Any Record Since Random Selection For Spotlight Started");
                alert.showAndWait();
                return;
            }
            showPane(paneConfig);
        }
        if(actionEvent.getSource() == btn2) {
            showPane(paneVPD);
        }
        if(actionEvent.getSource() == btn3) {
            if (random_spotlight) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Random Selection For Spotlight Started");
                alert.setHeaderText(null);
                alert.setContentText("You Can't Save Any Records Since Random Selection For Spotlight Started");
                alert.showAndWait();
                return;
            }
            showPane(paneSPD);
        }
        if(actionEvent.getSource() == btn4) {
            showPane(paneRandomSel);
        }
        if(actionEvent.getSource() == btn5) {
            if(!random_spotlight) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("No Finalists Are Selected Yet");
                alert.setHeaderText(null);
                alert.setContentText("Please Select Project For Final Round");
                alert.showAndWait();
                return;
            }
            showPane(paneSelectWinners);
        }
        if(actionEvent.getSource() == btn6) {
            if(!gotwinners) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("No Winners Are Selected Yet");
                alert.setHeaderText(null);
                alert.setContentText("Please Select Winners For Visualize The Points");
                alert.showAndWait();
                return;
            }
            showPane(paneVisualize);
        }
        if(actionEvent.getSource() == btn7) {
            showPane(paneHome);
        }
    }

    //Switch Between add,update and delete panes
    public void buttonClicksConfig(ActionEvent actionEvent) {
        if(actionEvent.getSource() == btnADD) {
            showPane(paneAdd);
        }
        if(actionEvent.getSource() == btnUpdate) {
            showPane(paneUpdate);
        }
        if(actionEvent.getSource() == btnDelete) {
            showPane(paneDelete);
        }
    }

    // Method to show a specific pane and hide all others
    private void showPane(AnchorPane paneToShow) {
        paneHome.setVisible(false);
        paneConfig.setVisible(false);
        paneVPD.setVisible(false);
        paneSPD.setVisible(false);
        paneRandomSel.setVisible(false);
        paneSelectWinners.setVisible(false);
        paneVisualize.setVisible(false);
        paneAdd.setVisible(false);
        paneDelete.setVisible(false);
        paneUpdate.setVisible(false);

        paneToShow.setVisible(true);
        paneToShow.toFront();
    }


    public void AddProjects(ActionEvent ignoredADD) {

        ProjectDetails project = null;

        try {
            int P_ID = Integer.parseInt(inputID.getText());
            String P_Name = capitalize(inputName.getText());
            String PCAT = capitalize(inputCat.getText());
            String P_Team = capitalize(inputTeam.getText());
            String P_Des = capitalize(inputDes.getText());
            String P_Country = capitalize(inputCountry.getText());
            Image Logo = imageView.getImage();

            //Validations
            for(ProjectDetails dupID: ProjectDetailsList) {
                if(dupID.getP_ID() == P_ID) {
                    labelAdd.setText("Project Already Exists");
                    return;
                }
            }

            if(P_ID < 0 || P_Name.isEmpty() || PCAT.isEmpty() || P_Team.isEmpty() || P_Des.isEmpty() || P_Country.isEmpty()) {
                labelAdd.setText("All The Fields Must Be Fill");
            }

            if(!P_Name.matches("^\\D+$") || !PCAT.matches("^\\D+$") || !P_Team.matches("^\\D+$") || !P_Country.matches("^\\D+$")) {
                labelAdd.setText("There Are Numbers In The Fields. Can't Contain Numbers");
            }

            project = new ProjectDetails(P_ID, P_Name, PCAT, P_Team, P_Des, P_Country, Logo);

        } catch (NumberFormatException d) {
            labelAdd.setText("ID Must Be a Number");
        }

        ProjectDetails ProjectData = project;

        if (ProjectData != null) {
            ProjectDetailsList.add(new ProjectDetails(ProjectData.getP_ID(), ProjectData.getP_Name(), ProjectData.getPCAT(), ProjectData.getP_Team(), ProjectData.getP_Des(), ProjectData.getP_Country(), ProjectData.getLogo()));

            //Clear Fields After Add Data
            inputID.setText("");
            inputName.setText("");
            inputCat.setText("");
            inputTeam.setText("");
            inputDes.setText("");
            inputCountry.setText("");
            labelAdd.setText("Details Added To The Table Successfully");
            imageView.setImage(null);
            sortLabel.setText("");
        }

        //Empty the label after some time
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), event -> labelAdd.setText("")));
        timeline.play();
    }


    public void updateProject(ActionEvent ignoredUpdate) {
        ProjectDetails selectedProject = tableUpdate.getSelectionModel().getSelectedItem();
        if (selectedProject == null) {
            labelUpdate.setText("Please select a project to update.");
            return;
        }

        int originalId = selectedProject.getP_ID();
        int newId = originalId;
        boolean updateId = false;

        if (!inputUpdateID.getText().equals(String.valueOf(originalId))) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Update Project ID");
            alert.setHeaderText(null);
            alert.setContentText("Do you want to update the project ID?");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.isPresent() && result.get() == ButtonType.OK) {
                try {
                    newId = Integer.parseInt(inputUpdateID.getText());
                    updateId = true;
                } catch (NumberFormatException e) {
                    labelUpdate.setText("Invalid Project ID. Please enter a valid number.");
                    return;
                }
            } else {
                inputUpdateID.setText(String.valueOf(originalId));
            }
        }

        String P_Name = capitalize(inputUpdateName.getText());
        String PCAT = capitalize(InputUpdateCat.getText());
        String P_Team = capitalize(inputUpdateTeam.getText());
        String P_Des = capitalize(inputUpdateDes.getText());
        String P_Country = capitalize(inputUpdateCountry.getText());
        Image Logo = imageViewUpd.getImage();

        // Validations
        if (P_Name.isEmpty() || PCAT.isEmpty() || P_Team.isEmpty() || P_Des.isEmpty() || P_Country.isEmpty()) {
            labelUpdate.setText("All fields must be filled.");
            return;
        }

        if (!P_Name.matches("^\\D+$") || !PCAT.matches("^\\D+$") || !P_Team.matches("^\\D+$") || !P_Country.matches("^\\D+$")) {
            labelUpdate.setText("Name, Category, Team, and Country fields cannot contain numbers.");
            return;
        }

        // Check for duplicate ID if updating ID
        if (updateId) {
            for (ProjectDetails project : ProjectDetailsList) {
                if (project.getP_ID() == newId && project != selectedProject) {
                    labelUpdate.setText("A project with this ID already exists.");
                    return;
                }
            }
        }

        // Update the project
        ProjectDetails updatedProject = new ProjectDetails(newId, P_Name, PCAT, P_Team, P_Des, P_Country, Logo);
        int index = ProjectDetailsList.indexOf(selectedProject);
        ProjectDetailsList.set(index, updatedProject);

        // Clear fields after update
        inputUpdateID.setText("");
        inputUpdateName.setText("");
        InputUpdateCat.setText("");
        inputUpdateTeam.setText("");
        inputUpdateDes.setText("");
        inputUpdateCountry.setText("");
        imageViewUpd.setImage(null);
        labelUpdate.setText("Project details updated successfully.");
        tableUpdate.refresh();

        // Empty the label after some time
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), event -> labelUpdate.setText("")));
        timeline.play();
    }

    public void updateFields(MouseEvent ignoredUpdate) {
        ProjectDetails projectDetails = tableUpdate.getSelectionModel().getSelectedItem();
        if(projectDetails != null) {
            inputUpdateID.setText(String.valueOf(projectDetails.getP_ID()));
            inputUpdateName.setText(projectDetails.getP_Name());
            InputUpdateCat.setText(projectDetails.getPCAT());
            inputUpdateTeam.setText(projectDetails.getP_Team());
            inputUpdateDes.setText(projectDetails.getP_Des());
            inputUpdateCountry.setText(projectDetails.getP_Country());
            imageViewUpd.setImage(projectDetails.getLogo());
        }
    }


    public void deleteProject(ActionEvent ignoreDelete) {
        if(ProjectDetailsList.isEmpty()) {
            labelDelete.setText("There Are No Records To Delete");
            return;
        }
        ProjectDetails index = tableDelete.getSelectionModel().getSelectedItem();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Delete Project");
        alert.setHeaderText("Are You Sure You Want To Delete Project");
        Optional<ButtonType> output = alert.showAndWait();

        if(output.isPresent() && output.get() == ButtonType.OK) {
            ProjectDetailsList.remove(index);
            tableUpdate.refresh();
            labelDelete.setText("Project Deleted Successfully");
        }
    }

    //Sort Project By ID
    public void sortProjects() {
        int n = ProjectDetailsList.size();

        if (n < 1) {
            sortLabel.setText("There Are No Records To Sort");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ProjectDetailsList.get(j).getP_ID() > ProjectDetailsList.get(j + 1).getP_ID()) {
                    ProjectDetails temp = ProjectDetailsList.get(j);
                    ProjectDetailsList.set(j, ProjectDetailsList.get(j + 1));
                    ProjectDetailsList.set(j + 1, temp);
                }

            }
        }

        //View Sorted Projects(this part is mistake because i already write this in the initialize method)
        //i can remove this part.
        ViewPID.setCellValueFactory(new PropertyValueFactory<>("P_ID"));
        ViewPName.setCellValueFactory(new PropertyValueFactory<>("P_Name"));
        ViewPCat.setCellValueFactory(new PropertyValueFactory<>("PCAT"));
        ViewPTeam.setCellValueFactory(new PropertyValueFactory<>("P_Team"));
        ViewPDes.setCellValueFactory(new PropertyValueFactory<>("P_Des"));
        ViewPCountry.setCellValueFactory(new PropertyValueFactory<>("P_Country"));
        ViewPLogo.setCellFactory(column -> new ImageTableCell<>(80));
        ViewPLogo.setCellValueFactory(new PropertyValueFactory<>("Logo"));

        tableView.setItems(ProjectDetailsList);
        sortLabel.setText("Projects Sorted Successfully According To The Project ID");

    }

    //Save Project Details To The Text File.
    public void saveProjects() {
        if(ProjectDetailsList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Not Enough Projects");
            alert.setHeaderText(null);
            alert.setContentText("There Are No Records To Save. Please Add Project Records.");
            alert.showAndWait();
            return;
        }

        //put records to text file
        try{
            File file = new File("project_details.txt");
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            Set<String> uniquecategories = new HashSet<>();
            for (ProjectDetails project : ProjectDetailsList) {
                uniquecategories.add(project.getPCAT());
            }

            for (String group : uniquecategories) {
                bufferedWriter.write("Group " + group + ":\n");
                for (ProjectDetails project : ProjectDetailsList) {
                    if (project.getPCAT().equals(group)) {
                        bufferedWriter.write(String.format("Project ID: %d | Project Name: %s | Category: %s | Team Members: %s | Description: %s | Country: %s\n",
                                project.getP_ID(), project.getP_Name(), project.getPCAT(), project.getP_Team(), project.getP_Des(), project.getP_Country()));
                    }
                }
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Saved");
            alert.setHeaderText(null);
            alert.setContentText("Project details Saved Successfully.");
            alert.showAndWait();


        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Got Some Error While Saving Project");
            alert.showAndWait();
        }

    }


    public void SelectRandomProjects(ActionEvent ignoredRandom) {

        Map<String, List<ProjectDetails>> projectsByCategory = new HashMap<>();
        List<ProjectDetails> randomProjects = new ArrayList<>();

        try {
            // Read the file
            File file = new File("project_details.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            String currentCategory = "";

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Group")) {
                    currentCategory = line.split(" ", 2)[1].replace(":", "").trim();
                    projectsByCategory.put(currentCategory, new ArrayList<>());

                } else if (line.startsWith("Project ID:")) {
                    String[] parts = line.split(" \\| ");
                    int id = Integer.parseInt(parts[0].split(": ")[1]);
                    String name = parts[1].split(": ")[1];
                    String category = parts[2].split(": ")[1];
                    String team = parts[3].split(": ")[1];
                    String description = parts[4].split(": ")[1];
                    String country = parts[5].split(": ")[1];

                    ProjectDetails project = new ProjectDetails(id, name, category, team, description, country, null);
                    projectsByCategory.get(currentCategory).add(project);
                }
            }
            reader.close();

            // Select one project from each category
            Random random = new Random();
            for (String category : projectsByCategory.keySet()) {
                List<ProjectDetails> projectsInCategory = projectsByCategory.get(category);
                if (!projectsInCategory.isEmpty()) {
                    int randomIndex = random.nextInt(projectsInCategory.size());
                    randomProjects.add(projectsInCategory.get(randomIndex));
                }
            }

            // Check if we have at least 4 projects
            if (randomProjects.size() < 4) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Not Enough Projects");
                alert.setHeaderText(null);
                alert.setContentText("There are not enough projects to display. At least 4 projects from different categories are required.");
                alert.showAndWait();
                return;
            }

            // Update the random selection table view
            RandomPID.setCellValueFactory(new PropertyValueFactory<>("P_ID"));
            RandomPName.setCellValueFactory(new PropertyValueFactory<>("P_Name"));
            RandomPCat.setCellValueFactory(new PropertyValueFactory<>("PCAT"));
            RandomPTeam.setCellValueFactory(new PropertyValueFactory<>("P_Team"));
            RandomPDes.setCellValueFactory(new PropertyValueFactory<>("P_Des"));
            RandomPCountry.setCellValueFactory(new PropertyValueFactory<>("P_Country"));

            tableRandomProjects.setItems(FXCollections.observableArrayList(randomProjects));

            // Set the flag for random spotlight selection
            random_spotlight = true;

        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Error reading the project details file: " + e.getMessage());
            alert.showAndWait();
        }

    }

    public void selectWinners(ActionEvent actionEvent) {
        if (!random_spotlight) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Projects Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select projects for spotlight first.");
            alert.showAndWait();
            return;
        }

        spotlightProjects = new ArrayList<>(tableRandomProjects.getItems());
        currentProjectIndex = 0;
        projectScores.clear();

        judgePoints();

    }

    public void judgePoints() {
        if (currentProjectIndex < spotlightProjects.size()) {
            ProjectDetails currentProject = spotlightProjects.get(currentProjectIndex);
            WinnersLabel.setText(String.format("ID: %s\nProject: %s\nCategory: %s\nTeam: %s\nCountry: %s",
                    currentProject.getP_ID(), currentProject.getP_Name(), currentProject.getPCAT(),
                    currentProject.getP_Team(), currentProject.getP_Country()));

            // Enable input fields and OK button
            InputPoint1.setDisable(false);
            InputPoint2.setDisable(false);
            InputPoint3.setDisable(false);
            InputPoint4.setDisable(false);
            PointOkBtn.setDisable(false);

        } else {
            // All projects have been judged, calculate and display winners
            List<Map.Entry<ProjectDetails, Integer>> sortedProjects = new ArrayList<>(projectScores.entrySet());

            // Bubble sort implementation
            for (int i = 0; i < sortedProjects.size() - 1; i++) {
                for (int j = 0; j < sortedProjects.size() - i - 1; j++) {
                    Map.Entry<ProjectDetails, Integer> entry1 = sortedProjects.get(j);
                    Map.Entry<ProjectDetails, Integer> entry2 = sortedProjects.get(j + 1);

                    int scoreComparison = entry2.getValue().compareTo(entry1.getValue());
                    if (scoreComparison > 0 || (scoreComparison == 0 && entry1.getKey().getP_Name().compareTo(entry2.getKey().getP_Name()) > 0)) {
                        // Swap elements
                        sortedProjects.set(j, entry2);
                        sortedProjects.set(j + 1, entry1);
                    }
                }
            }

            StringBuilder winnerText = new StringBuilder("Winners Are!!!!!\n");

            for (int i = 0; i < Math.min(3, sortedProjects.size()); i++) {
                ProjectDetails project = sortedProjects.get(i).getKey();
                int score = sortedProjects.get(i).getValue();
                String place = (i == 0) ? "1st" : (i == 1) ? "2nd" : "3rd";

                if (i > 0 && score == sortedProjects.get(i-1).getValue()) {
                    place = "Tied for " + (i == 1 ? "1st" : "2nd");
                }

                String winnerString = String.format("%s Place: %s\n Points: %d\n", place, project.getP_ID(), score);
                winnerText.append(winnerString);

                switch (i) {
                    case 0: Win1.setText(winnerString); break;
                    case 1: Win2.setText(winnerString); break;
                    case 2: Win3.setText(winnerString); break;
                }
            }

            WinnersLabel.setText(winnerText.toString());
            gotwinners = true;

            // Disable input fields and OK button
            InputPoint1.setDisable(true);
            InputPoint2.setDisable(true);
            InputPoint3.setDisable(true);
            InputPoint4.setDisable(true);
            PointOkBtn.setDisable(true);
            return;
        }

        // This part handles the OK button click for entering scores
        PointOkBtn.setOnAction(e -> {
            try {
                int[] points = {
                        Integer.parseInt(InputPoint1.getText()),
                        Integer.parseInt(InputPoint2.getText()),
                        Integer.parseInt(InputPoint3.getText()),
                        Integer.parseInt(InputPoint4.getText())
                };

                for (int point : points) {
                    if (point < 1 || point > 5) {
                        throw new IllegalArgumentException("Points must be between 1 and 5");
                    }
                }

                int totalPoints = Arrays.stream(points).sum();
                projectScores.put(spotlightProjects.get(currentProjectIndex), totalPoints);

                // Clear input fields
                InputPoint1.clear();
                InputPoint2.clear();
                InputPoint3.clear();
                InputPoint4.clear();

                currentProjectIndex++;
                judgePoints();

            } catch (NumberFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Invalid Input");
                alert.setHeaderText(null);
                alert.setContentText("Please enter valid numbers for all judges' points.");
                alert.showAndWait();

            } catch (IllegalArgumentException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Invalid Points");
                alert.setHeaderText(null);
                alert.setContentText(ex.getMessage());
                alert.showAndWait();
            }
        });
    }



    public void PointVisualization(ActionEvent actionEvent) {
        if (!gotwinners) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Winners Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select winners before visualizing points.");
            alert.showAndWait();
            return;
        }

        // Clear any existing data in the chart
        PointsChart.getData().clear();

        // Create a new series for the data
        XYChart.Series series = new XYChart.Series();
        series.setName("Project Points");

        // Add data to the series for all projects in spotlightProjects
        for (ProjectDetails project : spotlightProjects) {
            Integer points = projectScores.get(project);
            if (points != null) {
                String yAxisLabel = project.getP_Name() + " ," + project.getP_Country();
                series.getData().add(new XYChart.Data<>(points, yAxisLabel));
            }

        }
        PointsChart.setCategoryGap(0);

        // Add the series to the chart
        PointsChart.getData().addAll(series);

        PointsChart.layout();

    }

    //Method to exit.
    @FXML
    public void exit(ActionEvent ignoredExit) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Are you sure you want to exit?");
        Optional<ButtonType> output = alert.showAndWait();

        if (output.isPresent() && output.get() == ButtonType.OK) {
            System.exit(0);

        }
    }
}

    

