/*
 * Copyright 2018 Rundeck, Inc. (http://rundeck.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.rundeck.client.tool.options;

import com.lexicalscope.jewel.cli.CommandLineInterface;
import com.lexicalscope.jewel.cli.Option;
import com.lexicalscope.jewel.cli.Unparsed;
import org.rundeck.client.api.model.DateInfo;

import java.util.List;

@CommandLineInterface(application = "retry")
public interface RetryBaseOptions extends JobIdentOptions, FollowOptions, RetryExecutionOption {
    @Option(shortName = "l",
            longName = "logevel",
            description = "Run the command using the specified LEVEL. LEVEL can be verbose, info, warning, error.",
            defaultValue = {"info"},
            pattern = "(verbose|info|warning|error)")
    String getLoglevel();


    @Option(shortName = "u", longName = "user", description = "A username to run the job as, (runAs access required).")
    String getUser();

    boolean isUser();

    @Option(shortName = "F", longName = "failedNodes", description = "Run only on failed nodes (default=true).",
            defaultValue = {"true"},
            pattern = "(true|false)")
    String getFailedNodes();


    @Unparsed(name = "-- -OPT VAL -OPT2 VAL -OPTFILE @filepath", description = "Job options")
    List<String> getCommandString();

}

