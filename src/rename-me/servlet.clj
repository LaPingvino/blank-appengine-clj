(ns rename-me.servlet
  (:gen-class
    :extends javax.servlet.http.HttpServlet)
  (:use
    compojure.http
    compojure.html)
  (:require
    [appengine-clj.users    :as users]))


(defroutes guestbook-app
  (ANY "*"
    [404 "Not found!"]))

(defservice (users/wrap-with-user-info replace-me-app))

