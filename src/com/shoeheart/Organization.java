package com.shoeheart;

import java.util.Set;

/**
 * Created by Nathan on 8/8/17.
 *
 * Represents a group of users in which the songs and arrangements they create may be shared. It is assumed that when a
 * user within that organization creates a song to be associated with it, they have the rights to play that song.
 *
 * Users may be associated with more than one organization, but if so, when creating a song, it will be created under
 * the one that is currently selected.
 *
 * todo - decide whether or not this site will support a function where a user may copy a song over to another organization they are a part of
 *
 * todo - decide whether or not to create a function that automatically handles licensing of songs created within this organization and charges it to them on behalf of CCLI, for example
 *
 * todo - decide whether or not to put limit on songs that can be associated with an organization before needing to start paying subscription
 */
public class Organization {
    public String name;
    public String description;
    //todo representation of licensing plan (or lack of one)

    // will probably have to make a join table for users once this turns into a database, or find better method of organization
    // also will probs need to come up with permissions hierarchy for organizations (admin / creator / curator / viewer)
    public Set<User> users;

    public Organization(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }
}
