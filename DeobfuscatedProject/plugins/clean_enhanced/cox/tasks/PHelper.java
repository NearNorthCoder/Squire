/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 */
package gg.squire.cox.tasks;

import net.runelite.api.NPC;

public class PHelper {
    private  NPC bA;
    private  int bB;

    public void q(int n2) {
        this.bB = n2;
    }

    public NPC aP() {
        return this.bA;
    }

    public int aQ() {
        return this.bB;
    }

    public PHelper(NPC nPC, int n2) {
        this.bA = nPC;
        this.bB = n2;
    }

    public void a(NPC nPC) {
        this.bA = nPC;
    }
}

