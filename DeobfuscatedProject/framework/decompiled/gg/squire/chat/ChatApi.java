/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonParseException
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.GameState
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.client.Static
 *  okhttp3.MediaType
 *  okhttp3.OkHttpClient
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 */
package gg.squire.chat;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import gg.squire.chat.CompletionRequest;
import gg.squire.chat.CompletionResponse;
import gg.squire.chat.CustomResponseMessage;
import gg.squire.chat.MessageWithContext;
import gg.squire.chat.Model;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.plugins.fw.TaskManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.client.Static;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ChatApi {
    private static final String BASE_URL = "https://api.openai.com/v1/chat/";
    private static final MediaType JSON = MediaType.get((String)"application/json; charset=utf-8");
    private static final OkHttpClient CLIENT = new OkHttpClient();
    private static final Gson GSON = new Gson();
    private static final String SYSTEM_MESSAGE = "You are given a json structure of the type:  \n{ context: Map, history: string[], message: [] }\n\nThe context is a map with variables and values for those variables that you might want to use in constructing your response.\n\nRead the following rules carefully and always consider them before giving a response:\n1) You are a runescape player named %s. \n2) You may need to to talk back to other runescape players given their messages and the context of the game\n3) Do not make any of your message longer than 10 words. \n4) Use simplistic language, try to use some runescape terms/slang\n5) You can reply in multiple sentences if you want to, but make sure to press enter every ~10 words. \n6) Do not ask back any questions, the only thing you should ever do is respond.\n7) If you are asked whether or not you are a bot you should always deny the accusations by making a simple statement\n8) Do not use perfect punctuation/spelling. \n9) DO NOT ASK QUESTIONS BACK. \n10) Do not capitalize letters\"\n11). Be smart and figure out if you even need to answer a question, sometimes general statements are made and you dont need to respond. Sometimes it is fine to not answer a statement, in that case send the message \"No answer\"\n12) To allow you to interpret the message better, context variables are given that should help you give a more appropriate answer.\n13) Give back the message in the following format: {message: string, respond: number}, the respond value should contain the likelihood we should be responding to this message (as a percentage)\" +\n14) The last 10 messages are always sent as a history variable. They will be in the format '[SENDER_NAME]: [MESSAGE]' you need to decide based on the history whether you have something useful to add to the conversation and use the history context to shape your response15) If you believe the message is meant for some other player (so not for our player), respond with \"No answer\t\"";
    public static final CustomResponseMessage NO_ANSWER = CustomResponseMessage.builder().message("No answer").build();
    private static final List<ChatMessage> HISTORY = new ArrayList<ChatMessage>();
    private static long lastMessage;
    private static String apiKey;

    public static CompletableFuture<String> respondToMessage(ChatMessage chatMessage, long timeBetweenMessages) {
        HISTORY.add(chatMessage);
        if (System.currentTimeMillis() - lastMessage < timeBetweenMessages) {
            return CompletableFuture.completedFuture(null);
        }
        if (chatMessage.getName().contains(Players.getLocal().getName()) || chatMessage.getMessage().length() < 5) {
            return CompletableFuture.completedFuture(null);
        }
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                String response = ChatApi.getCustomMessageIfShouldRespond(chatMessage, HISTORY);
                if (response != null) {
                    if (System.currentTimeMillis() - lastMessage < timeBetweenMessages) {
                        return null;
                    }
                    Thread.sleep((long)Rand.nextInt(500, 1000) + (long)Rand.nextInt(25, 125) * (long)response.length());
                    lastMessage = System.currentTimeMillis();
                    Keyboard.type(response, true);
                    return response;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }, executor);
        executor.shutdown();
        return future;
    }

    public static String getCustomMessageIfShouldRespond(ChatMessage chatMessage) {
        return ChatApi.getCustomMessageIfShouldRespond(chatMessage, Collections.emptyList());
    }

    public static String getCustomMessageIfShouldRespond(ChatMessage chatMessage, List<ChatMessage> history) {
        CustomResponseMessage customResponseMessage = ChatApi.getCustomResponseMessage(chatMessage, history);
        if (customResponseMessage.getMessage() == null || customResponseMessage.getMessage().equalsIgnoreCase("No answer")) {
            return null;
        }
        if (Rand.nextInt(0, 100) > customResponseMessage.getRespond()) {
            return null;
        }
        return customResponseMessage.getMessage();
    }

    public static CustomResponseMessage getCustomResponseMessage(ChatMessage message) {
        return ChatApi.getCustomResponseMessage(message, Collections.emptyList());
    }

    public static CustomResponseMessage getCustomResponseMessage(ChatMessage message, List<ChatMessage> history) {
        if (message.getType() != ChatMessageType.PUBLICCHAT) {
            return NO_ANSWER;
        }
        if (message.getSender() != null && message.getSender().equalsIgnoreCase(Players.getLocal().getName())) {
            return NO_ANSWER;
        }
        if (message.getName() != null && message.getName().contains(Players.getLocal().getName())) {
            return NO_ANSWER;
        }
        if (message.getMessage().startsWith("!") || message.getMessage().contains(":")) {
            return NO_ANSWER;
        }
        String pattern = "^-?\\d+(\\.\\d+)?$";
        if (message.getMessage().matches(pattern)) {
            return NO_ANSWER;
        }
        String messageJson = ChatApi.getMessage(MessageWithContext.builder().context(ChatApi.getContext()).history(history.subList(Math.max(0, history.size() - 10), history.size()).stream().map(chatMessage -> chatMessage.getSender() + ": " + chatMessage.getMessage()).collect(Collectors.toList())).message(message.getMessage()).build());
        try {
            CustomResponseMessage responseMessage = (CustomResponseMessage)GSON.fromJson(messageJson, CustomResponseMessage.class);
            if (responseMessage.getMessage().equals("Not directed at us")) {
                CustomResponseMessage.builder().message("No answer").build();
                return responseMessage;
            }
        }
        catch (JsonParseException jsonParseException) {
            System.out.println("Error parsing json from chatgpt response:\n " + messageJson);
        }
        return CustomResponseMessage.builder().message("No answer").build();
    }

    private static Map<String, Object> getContext() {
        ArrayList<String> plugins = new ArrayList<String>();
        ArrayList<String> otherPlugins = new ArrayList<String>();
        ArrayList<String> tasks = new ArrayList<String>();
        for (Plugin plugin : Static.getPluginManager().getPlugins()) {
            if (!Static.getPluginManager().isPluginEnabled(plugin)) continue;
            if (plugin instanceof SquirePlugin) {
                SquirePlugin squirePlugin = (SquirePlugin)plugin;
                TaskManager taskManager = squirePlugin.getManager();
                if (taskManager != null && taskManager.getCurrentTask() != null && !taskManager.getCurrentTask().isEmpty()) {
                    tasks.add(taskManager.getCurrentTask());
                }
                plugins.add(squirePlugin.getResourceName());
                continue;
            }
            if (plugin.getClass().isAnnotationPresent(SquireUtil.class)) {
                String descriptor = plugin.getClass().getAnnotation(PluginDescriptor.class).name();
                plugins.add(descriptor);
                continue;
            }
            if (plugin.getClass().getSuperclass() == Plugin.class) continue;
            otherPlugins.add(plugin.getClass().getAnnotation(PluginDescriptor.class).name());
        }
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("plugins", plugins);
        map.put("otherPlugins", otherPlugins);
        map.put("members_world", Static.getClient().isMembersWorld());
        map.put("coordinates", Optional.ofNullable(Players.getLocal()).map(Actor::getWorldLocation).orElse(null));
        String user = Static.getClient().getUsername();
        String realUser = user == null || user.isEmpty() ? Static.getClient().getJagexCharacterId() : user;
        map.put("user", realUser);
        map.put("display_name", Game.getState() == GameState.LOGGED_IN ? Players.getLocal().getName() : realUser);
        map.put("players", Players.getAll().stream().map(Actor::getName).collect(Collectors.toList()));
        map.put("npcs", NPCs.getAll().stream().map(NPC::getName).filter(Objects::nonNull).collect(Collectors.toList()));
        map.put("my_current_tasks", tasks);
        for (Skill skill : Skill.values()) {
            map.put(skill.name().toLowerCase() + "_level", Skills.getLevel(skill));
        }
        return map;
    }

    private static String getMessage(MessageWithContext messageWithContext) {
        CompletionRequest completionRequest = CompletionRequest.builder().model(Model.GPT4TURBO.getApiName()).numberOfChoices(1).messages(List.of(CompletionRequest.Message.builder().role("system").content(String.format(SYSTEM_MESSAGE, Players.getLocal().getName())).build(), CompletionRequest.Message.builder().content(GSON.toJson((Object)messageWithContext)).role("user").build())).build();
        CompletionResponse response = ChatApi.post("completions", completionRequest);
        if (response == null) {
            return null;
        }
        return response.getChoices().get(0).getMessage().getContent();
    }

    private static CompletionResponse post(String path, Object requestBody) {
        CompletionResponse completionResponse;
        block8: {
            RequestBody body = RequestBody.create((MediaType)JSON, (String)GSON.toJson(requestBody));
            Request request = new Request.Builder().url(BASE_URL + path).post(body).addHeader("Content-Type", "application/json").addHeader("Authorization", "Bearer " + apiKey).build();
            Response response = CLIENT.newCall(request).execute();
            try {
                completionResponse = (CompletionResponse)GSON.fromJson(response.body().string(), CompletionResponse.class);
                if (response == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (response != null) {
                        try {
                            response.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            response.close();
        }
        return completionResponse;
    }

    public static void setApiKey(String apiKey) {
        ChatApi.apiKey = apiKey;
    }

    static {
        apiKey = "";
    }
}
