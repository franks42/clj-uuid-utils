(defproject org.clojars.franks42/clj-uuid-utils "1.0.0-SNAPSHOT"
  :description "Thin Clojure-library wrapper over java.util.UUID plus some convenience transformation/type-coercion fns."
  :url "https://github.com/franks42/clj-uuid-utils"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "See the notice in README.md or details in COPYING"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :dev-dependencies [[clj-ns-browser "1.3.2-SNAPSHOT"]
                     [codox "0.6.4"]
                     ]
  :plugins [[codox "0.6.4"]
            ]
  :profiles {:1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :master {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :dev {:dependencies [[clj-ns-browser "1.3.2-SNAPSHOT"]]}}
  :aliases  {"all" ["with-profile" "dev,master"]}
;;   :main clj-uuid-utils
  )
