/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Icet.DefenceSystem;

/**
 *
 * @author Yasidu
 */

import java.util.*;
import controllerPanel.*;
import javaComponents.*;
import Controll.*;


public class SafetySystem {
    public static void main(String[] args) {
        Controll controll = new Controll();
        ControlPanel controlPanel = new ControlPanel(controll);
        Submarine submarine = new Submarine(controlPanel,controll);
        Tank tank = new Tank(controlPanel,controll);
        HelicopterView helicopter = new HelicopterView(controlPanel,controll);

        controll.addModel(helicopter);
        controll.addModel(submarine);
        controll.addModel(tank);
    }
}
