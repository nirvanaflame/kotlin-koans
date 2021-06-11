fun joinOptions(options: Collection<String>,
                prefix: String = "[",
                postfix: String = "]"): String =
        options.joinToString(", ", prefix, postfix)

