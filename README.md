# clj-uuid-utils

Thin wrapper over java.util.UUID plus some convenience transformation/type-coercion fns.

## Installation

Add the following to your `project.clj` dependencies:

```clojure
[org.clojars.franks42/clj-uuid-utils "1.0.0-SNAPSHOT"]
```

## Usage

Require clj-uuid-utils library:

```clojure
(ns myapp
  (:use [clj-uuid-utils]))

(def a-random-uuid (make-random-uuid))

(def a-uri-from-uuid (make-uri a-random-uuid))

```

REPL examples:

```clojure

```


## License

Copyright (C) 2013 Frank Siebenlist

Distributed under the Eclipse Public License, the same as Clojure.
