package controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import tm.CustomerTM;

public class TableFormController {
    public TableView<CustomerTM> tblCustomer;
    public TextField txtID;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtContact;

    public void initialize(){
        loadTable();

        tblCustomer.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("cid"));
        tblCustomer.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCustomer.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("address"));
        tblCustomer.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("contact"));


        tblCustomer.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<CustomerTM>() {
            @Override
            public void changed(ObservableValue<? extends CustomerTM> observable, CustomerTM oldValue, CustomerTM newValue) {

                CustomerTM object = tblCustomer.getSelectionModel().getSelectedItem();

                txtID.setText(object.getCid());
                txtName.setText(object.getName());
                txtAddress.setText(object.getAddress());
                txtContact.setText(object.getContact());
            }
        });


    }

    public void loadTable(){
        ObservableList<CustomerTM> customerList = tblCustomer.getItems();

        customerList.add(new CustomerTM("C001", "Kamal", "Galle", "0766689983"));
        customerList.add(new CustomerTM("C002", "Nimal", "Colombo", "0726689983"));
        customerList.add(new CustomerTM("C003", "Amal", "Matara", "0716689983"));
        customerList.add(new CustomerTM("C004", "Saman", "Kandy", "0756689983"));
        customerList.add(new CustomerTM("C005", "Kumari", "Kaluthara", "0786689983"));

        tblCustomer.refresh();
    }
}
