/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controll;
import controllerPanel.*;
import java.util.*;
import modulePackage.*;
import javaComponents.*;
/**
 *
 * @author Yasidu
 */

    public class Controll {

    
    private int signal;
    private ArrayList<MainModel>  addList = new ArrayList();
    
    
    public void addModel(MainModel obj){
            addList.add(obj);
        }
    
    private void updateObject(){
            for (MainModel m : addList){
                m.start(signal);
            }
        }
    
    public void sendAreaClear(){
            for(MainModel m1 : addList){
                m1.areaClear();
            }
        }
    
    public void sendAreaNotCleared(){
            for(MainModel m1 : addList){
                m1.areaNotClear();
            }
        }
    
    public void getControlPanelMsg(){
            for(MainModel m1: addList){
            m1.sendControlPanelMsg();
        }
    }
    
    public void getCpSlider(int value){
            for(MainModel m1: addList){
            m1.sendControllPanelVale(value);
        }
    }
    
    public void setPostionSignal(int signal){
            if(this.signal != signal){
                this.signal = signal;
                    updateObject();
            }
        }
    
    
    }