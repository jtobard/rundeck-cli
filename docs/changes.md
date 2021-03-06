---
layout: page
title: Changes
permalink: /changes/
---

## 1.0.27

* fix exception with rd keys list when no keys are present [Issue #177](https://github.com/rundeck/rundeck-cli/issues/177)
* fix rd script issue `rd: source: not found` [Issue #173](https://github.com/rundeck/rundeck-cli/issues/173)
* fix [Issue #177](https://github.com/rundeck/rundeck-cli/issues/177)
* Fix [Issue #173](https://github.com/rundeck/rundeck-cli/issues/173) source with .

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.26...v1.0.27)

## 1.0.26

* Disabled interactive query paging for `executions deletebulk`
* Fix [Issue #169](https://github.com/rundeck/rundeck-cli/issues/169) project create does not require config input
* Disabled interactive query paging for
* Fix [Issue #167](https://github.com/rundeck/rundeck-cli/issues/167) query/deletebulk -m 0 throws exception
* Fix [Issue #168](https://github.com/rundeck/rundeck-cli/issues/168) add --require to executions deletebulk
* Fix [Issue #150](https://github.com/rundeck/rundeck-cli/issues/150) require --path/-p arg to keys subcommands

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.25...v1.0.26)

## 1.0.25

* `rd executions query` now supports `%job.*` format options
* `rd executions query` now does interactive paging if there are more results, and `--autopage` can be used in non-interactive mode to load all available pages of data
* Fix [Issue #163](https://github.com/rundeck/rundeck-cli/issues/163) enhance rd executions query paging
* Fix [Issue #158](https://github.com/rundeck/rundeck-cli/issues/158) rd executions query does not format job info

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.24...v1.0.25)

## 1.0.24

* Fix [Issue #156](https://github.com/rundeck/rundeck-cli/issues/156) npe if no stdin for project delete without --confirm
* Fix [Issue #157](https://github.com/rundeck/rundeck-cli/issues/157) project create can use config file
* support outformat option for tokens create/list/reveal

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.23...v1.0.24)

## 1.0.23

* Fix usage text for jbos reschedule/unschedule
* Fix [Issue #147](https://github.com/rundeck/rundeck-cli/issues/147) `jobs unschedule` disables execution
* Fix [Issue #136](https://github.com/rundeck/rundeck-cli/issues/136) parse error with 500 response for project delete

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.22...v1.0.23)

## 1.0.22

* Fix description of --alldeleted flag
* Fix [Issue #62](https://github.com/rundeck/rundeck-cli/issues/62) add flags to scm perform to include items automatically
* improve scripting of scm actions with -v flag
* fix [Issue #132](https://github.com/rundeck/rundeck-cli/issues/132) restore ACL/SCM validation error responses
* fix [Issue #72](https://github.com/rundeck/rundeck-cli/issues/72) Add RD_CONF to specify conf file

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.21...v1.0.22)

## 1.0.21

* Fix test
* fix [Issue #128](https://github.com/rundeck/rundeck-cli/issues/128) api calls not auto downgrading

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.20...v1.0.21)

## 1.0.20

* Add `rd users [list,info,edit]` (Rundeck 2.10+)
* fix tests
* Fix [Issue #126](https://github.com/rundeck/rundeck-cli/issues/126) Add API version downgrading
* Updated default API version to 21 (rundeck 2.10)
* Fix changelog for 1.0.18/1.0.19

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.19...v1.0.20)

## 1.0.19

* (no changes: Reissue to correctly release build artifacts)

## 1.0.18

* [Issue #124](https://github.com/rundeck/rundeck-cli/issues/124) fix error when unexpected chars in job output if formatter is used

## 1.0.17

* document RD_DATE_FORMAT
* fix [Issue #117](https://github.com/rundeck/rundeck-cli/issues/117) correctly parse datetime for execution data
* Fix [Issue #115](https://github.com/rundeck/rundeck-cli/issues/115) add `rd system mode info/active/passive`
* fix [Issue #102](https://github.com/rundeck/rundeck-cli/issues/102) Username/Password auth: improve auth flow

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.16...v1.0.17)

## 1.0.16

* fix [Issue #113](https://github.com/rundeck/rundeck-cli/issues/113) show load jobs output results correctly

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.15...v1.0.16)

## 1.0.15

* Fix [Issue #94](https://github.com/rundeck/rundeck-cli/issues/94) nodes command does not yet manage nodes
* fix [Issue #105](https://github.com/rundeck/rundeck-cli/issues/105) keys create error states incorrect prompt parameter
* fix [Issue #106](https://github.com/rundeck/rundeck-cli/issues/106) Cannot use the option jobs purge [--jobxact -J value]

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.14...v1.0.15)

## 1.0.14

* Fix [Issue #99](https://github.com/rundeck/rundeck-cli/issues/99): npe when scm import inputs tracked item job is null

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.13...v1.0.14)

## 1.0.13

* add `--charset` option for `rd keys create` password file contents
* read password file contents correctly fixes [Issue #97](https://github.com/rundeck/rundeck-cli/issues/97)

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.12...v1.0.13)

## 1.0.12

* Add API v19 support to `rd tokens`
* `rd tokens create` can specify roles, duration
* Add `rd tokens reveal` to reveal token given ID (v19+)
* Handle buggy create token response fix [Issue #95](https://github.com/rundeck/rundeck-cli/issues/95)

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.11...v1.0.12)

## 1.0.11

* Fix [Issue #37](https://github.com/rundeck/rundeck-cli/issues/37) add `-%/--outformat` to `rd run/adhoc/executions follow`

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.10...v1.0.11)

## 1.0.10

* Fix [Issue #89](https://github.com/rundeck/rundeck-cli/issues/89) run command is broken

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.9...v1.0.10)

## 1.0.9

* [Issue #79](https://github.com/rundeck/rundeck-cli/issues/79) Add `job run` support for file upload, using `-opt@ file` or `-opt @file` syntax
* Fix [Issue #73](https://github.com/rundeck/rundeck-cli/issues/73) Add `rd projects archives export/import`
* Fix [Issue #80](https://github.com/rundeck/rundeck-cli/issues/80) Add RD_INSECURE_SSL_HOSTNAME and RD_ALT_SSL_HOSTNAME
* Fix [Issue #83](https://github.com/rundeck/rundeck-cli/issues/83) verify `rd run` uses RD_PROJECT
* Fix [Issue #81](https://github.com/rundeck/rundeck-cli/issues/81) Add job schedule/exec enable/disable
* Fix link to insecure ssl config page
* APIv19: `rd run` file upload via -opt @file
* APIv19: new `rd jobs files` command

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.8...v1.0.9)

## 1.0.8

* Check the follow flag on run with delay. Fixes [Issue #76](https://github.com/rundeck/rundeck-cli/issues/76)
* Default API version set to 18, fixes [Issue #74](https://github.com/rundeck/rundeck-cli/issues/74)

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.7...v1.0.8)

## 1.0.7

* add `rd projects configure` subcommands

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.6...v1.0.7)

## 1.0.6

* log: add `rd run --delay` flag relative schedule
* log: `run --follow --at` waits before following
* Fix [Issue #65](https://github.com/rundeck/rundeck-cli/issues/65) run -f halts before job execution finishes
* log: add projects info -p name
* Fix [Issue #68](https://github.com/rundeck/rundeck-cli/issues/68) improve projects list output
* Fix [Issue #66](https://github.com/rundeck/rundeck-cli/issues/66) don't prompt when token or user+pass set
* Fix [Issue #63](https://github.com/rundeck/rundeck-cli/issues/63) allow RD_INSECURE_SSL=true

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.5...v1.0.6)

## 1.0.5

* Fix weird character
* Fix [Issue #60](https://github.com/rundeck/rundeck-cli/issues/60) add conf file sourcing in shadow rd script

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.4...v1.0.5)

## 1.0.4

* Fix [Issue #51](https://github.com/rundeck/rundeck-cli/issues/51) rd project scm should honor RD_PROJECT env var
* Fix [Issue #55](https://github.com/rundeck/rundeck-cli/issues/55) jobs info -%/--outformat option causes blank output
* unix: ~/.rd/rd.conf file can export env vars like RD_URL. fix [Issue #54](https://github.com/rundeck/rundeck-cli/issues/54)
* fix: NPE on 400 response to keys upload/create

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.3...v1.0.4)

## 1.0.3

* Add CHANGELOG fix [Issue #48](https://github.com/rundeck/rundeck-cli/issues/48)
* fix [Issue #44](https://github.com/rundeck/rundeck-cli/issues/44) add more SCM commands:

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.2...v1.0.3)

## 1.0.2

Date: 2016-12-13

* [#45](https://github.com/rundeck/rundeck-cli/issues/45)

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.1...v1.0.2)

## 1.0.1

Date: 2016-12-13

* [#42](https://github.com/rundeck/rundeck-cli/issues/42)
* [#43](https://github.com/rundeck/rundeck-cli/issues/43)
* [#47](https://github.com/rundeck/rundeck-cli/issues/47)

[Changes](https://github.com/rundeck/rundeck-cli/compare/v1.0.0...v1.0.1)

## 1.0.0

Date: 2016-12-05

Initial 1.0 release
