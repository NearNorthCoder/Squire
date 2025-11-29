/*
 * Decompiled with CFR 0.152.
 */
package c.r.m;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;

class j
implements ActionListener {
    final /* synthetic */ JComboBox X;
    final /* synthetic */ JLabel Y;

    j(JComboBox jComboBox, JLabel jLabel) {
        this.X = jComboBox;
        this.Y = jLabel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Color color = (Color)this.X.getSelectedItem();
        this.Y.setBackground(color);
    }
}
