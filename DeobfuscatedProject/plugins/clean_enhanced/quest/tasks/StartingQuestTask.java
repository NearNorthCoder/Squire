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
import gg.squire.quest.tasks.GameEnum4;

@TaskDesc(name="Starting Quest")
public class StartingQuestTask
extends Task {
    
    private static final  Logger aj;
    private final  SquireQuesterConfig al;
    private final  Client ak;

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    @Inject
    public StartingQuestTask(Client client, SquireQuesterConfig squireQuesterConfig) {
        this.ak = client;
        this.al = squireQuesterConfig;
    }

    private int a(int n2) {
        Object[] objectArray = new Object[var1[2]];
        objectArray[m.var1[0]] = var1[3];
        objectArray[m.var1[1]] = n2;
        this.ak.runScript(objectArray);
        return this.ak.getIntStack()[var1[0]];
    }

    private static void var3() {
        var1 = new int[4];
        m.var1[0] = (0x65 ^ 0x3A) & ~(0x76 ^ 0x29);
        m.var1[1] = 1;
        m.var1[2] = 2;
        m.var1[3] = 0xFFFFAFBE & 0x5FF9;
    }

    static {
        m.var3();
        aj = LoggerFactory.getLogger(StartingQuestTask.class);
    }

    private static boolean var4(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        m var5;
        if (m.var4((Object)this.al.quest(), (Object)h.BELOW_ICE_MOUNTAIN)) {
            return var1[0];
        }
        if (m.var2(var5.a(Quest.BELOW_ICE_MOUNTAIN.getId()))) {
            // empty if block
        }
        System.out.println("Progress: " + this.a(Quest.BELOW_ICE_MOUNTAIN.getId()));
        return var1[1];
    }
}

