/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.MessageNode
 *  net.runelite.api.Player
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.OverheadTextChanged
 */
package net.runelite.client.plugins.emojis;

import java.awt.image.BufferedImage;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.inject.Inject;
import net.runelite.api.MessageNode;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.OverheadTextChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ChatIconManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.emojis.Emoji;
import net.runelite.client.util.Text;

@PluginDescriptor(name="Emojis", description="Replaces common emoticons such as :) with their corresponding emoji in the chat", enabledByDefault=false)
public class EmojiPlugin
extends Plugin {
    private static final Pattern WHITESPACE_REGEXP = Pattern.compile("[\\s\\u00A0]");
    @Inject
    private ChatIconManager chatIconManager;
    private int[] iconIds;

    @Override
    protected void startUp() {
        this.loadEmojiIcons();
    }

    private void loadEmojiIcons() {
        if (this.iconIds != null) {
            return;
        }
        Emoji[] emojis = Emoji.values();
        this.iconIds = new int[emojis.length];
        for (int i = 0; i < emojis.length; ++i) {
            Emoji emoji = emojis[i];
            BufferedImage image = emoji.loadImage();
            this.iconIds[i] = this.chatIconManager.registerChatIcon(image);
        }
    }

    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        if (this.iconIds == null) {
            return;
        }
        switch (chatMessage.getType()) {
            case PUBLICCHAT: 
            case MODCHAT: 
            case FRIENDSCHAT: 
            case CLAN_CHAT: 
            case CLAN_GUEST_CHAT: 
            case CLAN_GIM_CHAT: 
            case PRIVATECHAT: 
            case PRIVATECHATOUT: 
            case MODPRIVATECHAT: {
                break;
            }
            default: {
                return;
            }
        }
        MessageNode messageNode = chatMessage.getMessageNode();
        String message = messageNode.getValue();
        String updatedMessage = this.updateMessage(message);
        if (updatedMessage == null) {
            return;
        }
        messageNode.setValue(updatedMessage);
    }

    @Subscribe
    public void onOverheadTextChanged(OverheadTextChanged event) {
        if (!(event.getActor() instanceof Player)) {
            return;
        }
        String message = event.getOverheadText();
        String updatedMessage = this.updateMessage(message);
        if (updatedMessage == null) {
            return;
        }
        event.getActor().setOverheadText(updatedMessage);
    }

    @Nullable
    String updateMessage(String message) {
        CharSequence[] messageWords = WHITESPACE_REGEXP.split(message);
        boolean editedMessage = false;
        for (int i = 0; i < messageWords.length; ++i) {
            String trigger = Text.removeFormattingTags(messageWords[i]);
            Emoji emoji = Emoji.getEmoji(trigger);
            if (emoji == null) continue;
            int emojiId = this.iconIds[emoji.ordinal()];
            messageWords[i] = ((String)messageWords[i]).replace(trigger, "<img=" + this.chatIconManager.chatIconIndex(emojiId) + ">");
            editedMessage = true;
        }
        if (!editedMessage) {
            return null;
        }
        return String.join((CharSequence)" ", messageWords);
    }
}

