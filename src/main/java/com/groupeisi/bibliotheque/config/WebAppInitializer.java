package com.groupeisi.bibliotheque.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Point d'entrée qui enregistre le DispatcherServlet de Spring MVC auprès du conteneur
 * de servlets (Tomcat), sans passer par web.xml.
 * Concrètement : au démarrage de Tomcat, cette classe est détectée automatiquement et son
 * code s'exécute pour construire et enregistrer le DispatcherServlet. Aucune déclaration
 * dans web.xml n'est nécessaire.
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * Classes de configuration du "contexte racine" (root ApplicationContext).
     * Ce contexte est partagé par toute l'application (utile pour séparer, par exemple,
     * la configuration des services de celle des contrôleurs web). Ce projet n'a qu'une
     * seule configuration ({@link SpringWebConfig}) qu'on place entièrement dans le
     * contexte du DispatcherServlet (voir {@link #getServletConfigClasses()}) : il n'y a
     * donc pas de contexte racine séparé ici.
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    /**
     * Classes de configuration du contexte propre au DispatcherServlet (contrôleurs,
     * ViewResolver, etc.). C'est ici que Spring va chercher les beans nécessaires au
     * traitement des requêtes web : {@link SpringWebConfig} déclare le ViewResolver,
     * la SessionFactory Hibernate, le TransactionManager, et active le scan des
     * {@code @Controller} via {@code @ComponentScan}.
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{SpringWebConfig.class};
    }

    /**
     * Mappe le DispatcherServlet sur "/" : il devient le point d'entrée de toutes les
     * requêtes qui ne correspondent à aucun autre servlet plus spécifique (comme
     * HelloServlet, mappé sur "/hello-servlet").
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
