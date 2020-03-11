(defproject lein-catapult "0.0.1"
  :description "TCP/IP -> Drawbridge nREPL proxy."
  :url "https://github.com/malyn/lein-catapult"
  :license {:name "BSD"
            :url "http://www.opensource.org/licenses/BSD-3-Clause"
            :distribution :repo }

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/core.async "0.4.474"]
                 [nrepl/nrepl      "0.6.0"]
                 [nrepl/drawbridge "0.2.1"]
                 [me.raynes/fs "1.4.6"]]

  :eval-in-leiningen true)
