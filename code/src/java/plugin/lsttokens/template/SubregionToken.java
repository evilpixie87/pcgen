package plugin.lsttokens.template;

import pcgen.core.PCTemplate;
import pcgen.persistence.lst.PCTemplateLstToken;

/**
 * Class deals with SUBREGION Token
 */
public class SubregionToken implements PCTemplateLstToken
{

	public String getTokenName()
	{
		return "SUBREGION";
	}

	public boolean parse(PCTemplate template, String value)
	{
		String subregion = value;
		if (value.equalsIgnoreCase("YES"))
		{
			subregion = template.getDisplayName();
		}
		template.setSubRegion(subregion);
		return true;
	}
}
