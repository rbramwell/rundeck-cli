---
# You don't need to edit this file, it's empty on purpose.
# Edit theme's home layout instead if you wanna make some changes
# See: https://jekyllrb.com/docs/themes/#overriding-theme-defaults
layout: page
---

# RD {{ site.app_version }}

[Source on Github]({{site.github_url}})

This is a new CLI tool for [Rundeck](https://github.com/rundeck/rundeck).

Its goal is to replace the old CLI Tools currently included with Rundeck
with a modernized, extensible, and nicer implementation.

The functionality of previous "rd-*" tools (from Rundeck) is now split into subcommands.

This project is (almost) at 1.0.x status.

## Requirements

Java 8

## Pages

{% for post in site.categories.doc %}
* [{{ post.title }}]({{ post.permalink }})
{% endfor %}

* [Install](/install)
* [Configuration](/configuration)
* [Commands](/commands)
* [Scripting](/scripting)