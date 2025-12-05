/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.reactivex.rxjava3.subjects.PublishSubject
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  org.jgroups.Address
 *  org.jgroups.JChannel
 *  org.jgroups.Message
 *  org.jgroups.ObjectMessage
 *  org.jgroups.Receiver
 *  org.jgroups.View
 *  org.jgroups.util.Util
 */
package com.openosrs.client.util;

import com.openosrs.client.OpenOSRS;
import com.openosrs.client.config.OpenOSRSConfig;
import com.openosrs.client.ui.OpenOSRSSplashScreen;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.client.RuneLite;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ClientShutdown;
import net.runelite.client.events.ConfigChanged;
import net.unethicalite.client.config.SquireConfig;
import org.jgroups.Address;
import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ObjectMessage;
import org.jgroups.Receiver;
import org.jgroups.View;
import org.jgroups.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class Groups
implements Receiver {
    private static final Logger log = LoggerFactory.getLogger(Groups.class);
    @Inject
    private OpenOSRSConfig openOSRSConfig;
    @Inject
    private SquireConfig squireConfig;
    @Inject
    private EventBus eventBus;
    private JChannel channel;
    private int instanceCount;
    private List<Address> members;
    private final Map<String, List<Address>> messageMap = new HashMap<String, List<Address>>();
    private final PublishSubject<Message> messageStringSubject = PublishSubject.create();
    private final PublishSubject<Message> messageObjectSubject = PublishSubject.create();

    public boolean init() {
        if (this.squireConfig.disableGroups()) {
            return false;
        }
        try (InputStream is = RuneLite.class.getResourceAsStream("/udp-openosrs.xml");){
            this.channel = new JChannel(is).setName(OpenOSRS.uuid).setReceiver((Receiver)this).setDiscardOwnMessages(true).connect("openosrs");
            this.eventBus.register(this);
        }
        catch (IOException ex) {
            log.error("Failed to initialize groups, disabling so we don't crash.", ex);
            this.eventBus.unregister(this);
            this.channel = null;
            return false;
        }
        catch (Exception ex) {
            log.error("Unforeseen exception while initializing groups, disabling.", ex);
            this.eventBus.unregister(this);
            this.channel = null;
            return false;
        }
        return true;
    }

    @Subscribe
    public void onClientShutdown(ClientShutdown event) {
        CompletableFuture<Void> f = this.close();
        if (f != null) {
            event.waitFor(f);
        }
    }

    public void broadcastString(String command) {
        this.send(null, command);
    }

    public void sendConfig(Address destination, ConfigChanged configChanged) {
        if (!this.openOSRSConfig.localSync() || OpenOSRSSplashScreen.showing() || this.instanceCount < 2) {
            return;
        }
        try {
            byte[] buffer = Util.objectToByteBuffer((Object)configChanged);
            Message message = new ObjectMessage().setDest(destination).setObject((Object)buffer);
            this.channel.send(message);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendString(String command) {
        String[] messageObject = command.split(";");
        String pluginId = messageObject[1];
        this.messageMap.put(pluginId, new ArrayList());
        for (Address member : this.channel.getView().getMembers()) {
            if (member.toString().equals(OpenOSRS.uuid)) continue;
            this.messageMap.get(pluginId).add(member);
            this.send(member, command);
        }
    }

    public void send(Address destination, String command) {
        if (!this.openOSRSConfig.localSync() || OpenOSRSSplashScreen.showing() || this.instanceCount < 2 || this.channel == null) {
            return;
        }
        try {
            this.channel.send((Message)new ObjectMessage(destination, (Object)command));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewAccepted(View view) {
        this.members = view.getMembers();
        this.instanceCount = this.members.size();
    }

    public void receive(Message message) {
        if (OpenOSRSSplashScreen.showing()) {
            return;
        }
        if (message.getObject() instanceof String) {
            this.messageStringSubject.onNext((Object)message);
        } else {
            this.messageObjectSubject.onNext((Object)message);
        }
    }

    private CompletableFuture<Void> close() {
        if (this.channel == null) {
            return null;
        }
        CompletableFuture<Void> future = new CompletableFuture<Void>();
        try {
            this.channel.close();
            future.complete(null);
        }
        catch (Exception ex) {
            future.completeExceptionally(ex);
        }
        return future;
    }

    public int getInstanceCount() {
        return this.instanceCount;
    }

    public List<Address> getMembers() {
        return this.members;
    }

    public Map<String, List<Address>> getMessageMap() {
        return this.messageMap;
    }

    public PublishSubject<Message> getMessageStringSubject() {
        return this.messageStringSubject;
    }

    public PublishSubject<Message> getMessageObjectSubject() {
        return this.messageObjectSubject;
    }
}

