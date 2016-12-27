package com.vladsch.flexmark.ext.typographic;

import com.vladsch.flexmark.Extension;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.options.DataKey;

/**
 * Extension for typographics
 * <p>
 * Create it with {@link #create()} and then configure it on the builders
 * ({@link com.vladsch.flexmark.parser.Parser.Builder#extensions(Iterable)},
 * {@link com.vladsch.flexmark.html.HtmlRenderer.Builder#extensions(Iterable)}).
 * </p>
 * <p>
 * The parsed typographic text is turned into {@link TypographicQuotes} and {@link TypographicSmarts} nodes.
 * </p>
 */
public class TypographicExtension implements Parser.ParserExtension, HtmlRenderer.HtmlRendererExtension {
    // public static final DataKey<TypographicRepository> TYPOGRAPHICS = new DataKey<>("TYPOGRAPHICS", TypographicRepository::new);
    // public static final DataKey<KeepType> TYPOGRAPHICS_KEEP = new DataKey<>("TYPOGRAPHICS_KEEP", KeepType.FIRST); // standard option to allow control over how to handle duplicates
    public static final DataKey<Boolean> TYPOGRAPHIC_QUOTES = new DataKey<>("TYPOGRAPHIC_QUOTES", true);
    public static final DataKey<Boolean> TYPOGRAPHIC_SMARTS = new DataKey<>("TYPOGRAPHIC_SMARTS", true);

    private TypographicExtension() {
    }

    public static Extension create() {
        return new TypographicExtension();
    }

    @Override
    public void extend(Parser.Builder parserBuilder) {
        //parserBuilder.postProcessorFactory(new TypographicNodePostProcessor.Factory());
    }

    @Override
    public void extend(HtmlRenderer.Builder rendererBuilder, String rendererType) {
        if (rendererType.equals("JIRA") || rendererType.equals("YOUTRACK")) {
            // rendererBuilder.linkResolverFactory(new TypographicLinkResolver.Factory());
            //rendererBuilder.nodeRendererFactory(TypographicNodeRenderer::new);
        } else if (rendererType.equals("HTML")) {
            // rendererBuilder.linkResolverFactory(new TypographicLinkResolver.Factory());
            //rendererBuilder.nodeRendererFactory(TypographicNodeRenderer::new);
        }
    }
}
