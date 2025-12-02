/*
 * Deobfuscated from: c/r/m/b.java
 * Original class name: b
 * Purpose: OkHttp CookieJar implementation for session management
 */
package squire.launcher.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/**
 * Simple in-memory CookieJar implementation for OkHttp.
 * Stores cookies by name for the authentication session.
 */
public class CookieJarImpl implements CookieJar {

    /**
     * Map storing cookies by their name
     */
    private Map<String, Cookie> cookies;

    /**
     * Saves cookies from an HTTP response.
     *
     * @param url The URL the response came from
     * @param cookieList List of cookies from the response
     */
    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookieList) {
        if (cookies == null) {
            cookies = new HashMap<>();
        }

        for (Cookie cookie : cookieList) {
            cookies.put(cookie.name(), cookie);
        }
    }

    /**
     * Loads cookies for an HTTP request.
     *
     * @param url The URL the request is going to
     * @return List of cookies to send with the request
     */
    @Override
    public List<Cookie> loadForRequest(HttpUrl url) {
        if (cookies != null) {
            return new ArrayList<>(cookies.values());
        }
        return new ArrayList<>();
    }

    /**
     * Gets all stored cookies.
     *
     * @return Collection of all stored cookies
     */
    public Collection<Cookie> getAllCookies() {
        return cookies != null ? cookies.values() : new ArrayList<>();
    }
}
