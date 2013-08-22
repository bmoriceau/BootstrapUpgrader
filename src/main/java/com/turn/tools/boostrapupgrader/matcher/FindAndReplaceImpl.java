package com.turn.tools.boostrapupgrader.matcher;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.turn.tools.boostrapupgrader.model.ParseElement;

@Component
@Scope(value = "singleton")
public class FindAndReplaceImpl implements FindAndReplace {

	Map<String, String> replaceVal = new HashMap<String, String>();

	@Autowired
	ParserNonSelector parserNonSelector;

	@Autowired
	ParserSelector parserSelector;

	public FindAndReplaceImpl() {

	}

	private void goThrough(ParseElement element) {
		while (element.getOffset() < element.getBuilder().length()) {
			if ('.' == element.getBuilder().charAt(element.getOffset())) {
				parserSelector.parse(element);
			} else {
				parserNonSelector.parse(element);
			}
		}
	}

	public String upgradeBootstrap(String fileBuffer) {
		StringBuilder builder = new StringBuilder(fileBuffer);

		goThrough(new ParseElement(builder, 0, 0));

		return builder.toString();
	}

}
