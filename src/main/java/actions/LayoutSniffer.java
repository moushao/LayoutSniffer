package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import javax.swing.*;

public class LayoutSniffer extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        JOptionPane.showInputDialog("却把青梅嗅");
    }
}
