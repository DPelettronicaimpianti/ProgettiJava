/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unipa.community.davideproietto.prg.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Tools",
        id = "it.unipa.community.davideproietto.prg.java.JavaAction"
)
@ActionRegistration(
        displayName = "#CTL_JavaAction"
)
@ActionReference(path = "Menu/Tools", position = 0)
@Messages("CTL_JavaAction=Java!")
public final class JavaAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
