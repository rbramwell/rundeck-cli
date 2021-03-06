package org.rundeck.client.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Describes an ACLPolicy item or directory
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ACLPolicyItem {
    private String path;
    private String type;
    private String href;
    private List<ACLPolicyItem> resources;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<ACLPolicyItem> getResources() {
        return resources;
    }

    public void setResources(List<ACLPolicyItem> resources) {
        this.resources = resources;
    }

    public Map<Object, Object> toMap() {
        HashMap<Object, Object> map = new LinkedHashMap<>();
        map.put("path", path);
        map.put("type", type);
        map.put("href", href);
        if ("directory".equals(type)) {
            map.put("resources", resources);
        }

        return map;
    }
}
