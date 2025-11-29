/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Quest
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.quest.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import net.runelite.api.Client;
import net.runelite.api.Quest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.quest.tasks.GameEnum26;

@TaskDesc(name="Starting Quest")
public class StartingQuestTask
extends Task {
    
    private static final  Logger aj;
    private final  SquireQuesterConfig al;
    private final  Client ak;

    private static boolean lIlIIIIllllIlll(int n2) {
        return n2 == 0;
    }

    @Inject
    public StartingQuestTask(Client client, SquireQuesterConfig squireQuesterConfig) {
        this.ak = client;
        this.al = squireQuesterConfig;
    }

    private int a(int n2) {
        Object[] objectArray = new Object[lIIIllIIlIllI[2]];
        objectArray[m.lIIIllIIlIllI[0]] = lIIIllIIlIllI[3];
        objectArray[m.lIIIllIIlIllI[1]] = n2;
        this.ak.runScript(objectArray);
        return this.ak.getIntStack()[lIIIllIIlIllI[0]];
    }

    static {
        m.lIlIIIIllllIlIl();
        aj = LoggerFactory.getLogger(StartingQuestTask.class);
    }

    private static boolean lIlIIIIllllIllI(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        m var1;
        if (m.lIlIIIIllllIllI((Object)this.al.quest(), (Object)h.BELOW_ICE_MOUNTAIN)) {
            return lIIIllIIlIllI[0];
        }
        if (m.lIlIIIIllllIlll(var1.a(Quest.BELOW_ICE_MOUNTAIN.getId()))) {
            // empty if block
        }
        System.out.println("Progress: " + this.a(Quest.BELOW_ICE_MOUNTAIN.getId()));
        return lIIIllIIlIllI[1];
    }
}

