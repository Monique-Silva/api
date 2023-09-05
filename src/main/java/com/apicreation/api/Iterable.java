package com.apicreation.api;

import java.util.Iterator;

public interface Iterable<T> {
    public Iterator<T> iterator();
}

/**
 * package src.main.fr.campus.java.dnd.Database;
 *
 * import src.main.fr.campus.java.dnd.characters.Hero;
 * import src.main.fr.campus.java.dnd.characters.warrior.Warrior;
 * import src.main.fr.campus.java.dnd.characters.wizard.Wizard;
 *
 * import java.io.InputStream;
 * import java.util.ArrayList;
 * import java.util.List;
 * import java.util.Properties;
 * import java.sql.*;
 *

 *     public static List<Hero> getHero() throws SQLException {
 *         List<Hero> heroes = new ArrayList<Hero>(); //initialisation de la liste des hero
 *
 *
 *         //etape 4. recuperation des données:
 *         while (result.next()) {
 *             Hero hero = null;
 *             String type = result.getString("type");
 *             if (type.equals("Warrior")) {
 *                 hero = new Warrior(result.getString("name"), result.getInt("life"), result.getInt("attack"));
 *             }
 *             if (type.equals("Wizard")) {
 *                 hero = new Wizard(result.getString("name"), result.getInt("life"), result.getInt("attack"));
 *             }
 *             String name = result.getString("name");
 *             Integer life = result.getInt("life");
 *             Integer attack = result.getInt("attack");
 *             String power = result.getString("power");
 *             String shield = result.getString("shield");
 *
 *             heroes.add(hero);
 *         }
 *
 *         return heroes;
 *     }
 * }
 */