(defproject hydrogen/module.cljs "0.5.2"
  :description "Duct module for developing and compiling ClojureScript"
  :url "https://github.com/duct-framework/module.cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.773"]
                 [binaryage/devtools "1.0.2"]
                 [duct/core "0.8.0"]
                 [duct/compiler.cljs "0.3.0"]
                 [hydrogen/server.figwheel-main "0.1.2"]
                 [integrant "0.8.0"]]
  :deploy-repositories [["snapshots" {:url "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_password
                                      :sign-releases false}]
                        ["releases"  {:url "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_password
                                      :sign-releases false}]]
  :profiles {:dev          [:project/dev :profiles/dev]
             :profiles/dev {}
             :project/dev  {:plugins [[lein-cljfmt "0.6.7"]
                                      [jonase/eastwood "0.3.11"]]}})
