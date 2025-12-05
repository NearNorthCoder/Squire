/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.http.api.ws;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class RuntimeTypeAdapterFactory<T>
implements TypeAdapterFactory {
    private final Class<?> baseType;
    private final String typeFieldName;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();

    private RuntimeTypeAdapterFactory(Class<?> baseType, String typeFieldName) {
        if (typeFieldName == null || baseType == null) {
            throw new NullPointerException();
        }
        this.baseType = baseType;
        this.typeFieldName = typeFieldName;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> baseType, String typeFieldName) {
        return new RuntimeTypeAdapterFactory<T>(baseType, typeFieldName);
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> baseType) {
        return new RuntimeTypeAdapterFactory<T>(baseType, "type");
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> type, String label) {
        if (type == null || label == null) {
            throw new NullPointerException();
        }
        if (this.subtypeToLabel.containsKey(type) || this.labelToSubtype.containsKey(label)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        this.labelToSubtype.put(label, type);
        this.subtypeToLabel.put(type, label);
        return this;
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> type) {
        return this.registerSubtype(type, type.getSimpleName());
    }

    public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> type) {
        if (type.getRawType() != this.baseType) {
            return null;
        }
        final LinkedHashMap labelToDelegate = new LinkedHashMap();
        final LinkedHashMap subtypeToDelegate = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            TypeAdapter<?> delegate = gson.getDelegateAdapter(this, TypeToken.get(entry.getValue()));
            labelToDelegate.put(entry.getKey(), delegate);
            subtypeToDelegate.put(entry.getValue(), delegate);
        }
        return new TypeAdapter<R>(){

            @Override
            public R read(JsonReader in) throws IOException {
                JsonElement jsonElement = Streams.parse(in);
                JsonElement labelJsonElement = jsonElement.getAsJsonObject().remove(RuntimeTypeAdapterFactory.this.typeFieldName);
                if (labelJsonElement == null) {
                    throw new JsonParseException("cannot deserialize " + String.valueOf(RuntimeTypeAdapterFactory.this.baseType) + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                String label = labelJsonElement.getAsString();
                TypeAdapter delegate = (TypeAdapter)labelToDelegate.get(label);
                if (delegate == null) {
                    throw new JsonParseException("cannot deserialize " + String.valueOf(RuntimeTypeAdapterFactory.this.baseType) + " subtype named " + label + "; did you forget to register a subtype?");
                }
                return delegate.fromJsonTree(jsonElement);
            }

            @Override
            public void write(JsonWriter out, R value) throws IOException {
                Class<?> srcType = value.getClass();
                String label = RuntimeTypeAdapterFactory.this.subtypeToLabel.get(srcType);
                TypeAdapter delegate = (TypeAdapter)subtypeToDelegate.get(srcType);
                if (delegate == null) {
                    throw new JsonParseException("cannot serialize " + srcType.getName() + "; did you forget to register a subtype?");
                }
                JsonObject jsonObject = delegate.toJsonTree(value).getAsJsonObject();
                if (jsonObject.has(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                    throw new JsonParseException("cannot serialize " + srcType.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                JsonObject clone = new JsonObject();
                clone.add(RuntimeTypeAdapterFactory.this.typeFieldName, new JsonPrimitive(label));
                for (Map.Entry<String, JsonElement> e : jsonObject.entrySet()) {
                    clone.add(e.getKey(), e.getValue());
                }
                Streams.write(clone, out);
            }
        }.nullSafe();
    }
}

