package com.myorg;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.constructs.Construct;

public class BistroAwsStack extends Stack {
    public BistroAwsStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public BistroAwsStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // The code that defines your stack goes here

        // example resource
        // final Queue queue = Queue.Builder.create(this, "BistroAwsQueue")
        //         .visibilityTimeout(Duration.seconds(300))
        //         .build();
    }
}
