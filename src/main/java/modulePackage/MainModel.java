/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modulePackage;

/**
 *
 * @author Yasidu
 */
public interface MainModel {
    void start(int signal);
    void areaClear();
    void areaNotClear();
    void sendControlPanelMsg();
    void sendControllPanelVale(int value);
}
