# Duct module.cljs

[![Clojars Project](https://img.shields.io/clojars/v/hydrogen/module.cljs.svg)](https://clojars.org/hydrogen/module.cljs)
[![Build Status](https://travis-ci.com/magnetcoop/module.cljs.svg?branch=master)](https://travis-ci.com/magnetcoop/module.cljs)

A [Duct][] module that adds support for compiling ClojureScript for
production and development.

### Note: Breaking change!
This fork experimentally uses Figwheel Main. Pay attention to config differences.

[duct]: https://github.com/duct-framework/duct

## Installation

To install, add the following to your project `:dependencies`:

[![Clojars Project](https://clojars.org/hydrogen/module.cljs/latest-version.svg)](https://clojars.org/hydrogen/module.cljs)

## Usage

To add this module to your configuration, add the `:duct.module/cljs`
key to your configuration. You'll need to specify your main
ClojureScript namespace via the `:main` key:

```edn
{:duct.module/cljs {:main foo.client}}
```

This sets up the [compiler.cljs][] key for compiling via `lein run
:duct/compiler`, and the [server.figwheel-main][] key for dynamically
reloading ClojureScript files during development when calling
`(reset)` in the REPL.

[compiler.cljs]:   https://github.com/duct-framework/compiler.cljs
[server.figwheel-main]: https://github.com/magnetcoop/server.figwheel-main

## License

Copyright © 2020 Magnet S Coop.

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
