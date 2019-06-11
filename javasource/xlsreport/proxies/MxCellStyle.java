// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public class MxCellStyle
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mxCellStyleMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "XLSReport.MxCellStyle";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		TextBold("TextBold"),
		TextItalic("TextItalic"),
		TextUnderline("TextUnderline"),
		TextAlignment("TextAlignment"),
		TextVerticalalignment("TextVerticalalignment"),
		TextColor("TextColor"),
		TextHeight("TextHeight"),
		BackgroundColor("BackgroundColor"),
		TextRotation("TextRotation"),
		WrapText("WrapText"),
		BorderTop("BorderTop"),
		BorderBottom("BorderBottom"),
		BorderLeft("BorderLeft"),
		BorderRight("BorderRight"),
		BorderColor("BorderColor"),
		Format("Format"),
		DecimalPlaces("DecimalPlaces"),
		DataFormatString("DataFormatString"),
		MxCellStyle_Template("XLSReport.MxCellStyle_Template");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MxCellStyle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "XLSReport.MxCellStyle"));
	}

	protected MxCellStyle(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxCellStyleMendixObject)
	{
		if (mxCellStyleMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("XLSReport.MxCellStyle", mxCellStyleMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a XLSReport.MxCellStyle");

		this.mxCellStyleMendixObject = mxCellStyleMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MxCellStyle.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static xlsreport.proxies.MxCellStyle initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return xlsreport.proxies.MxCellStyle.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static xlsreport.proxies.MxCellStyle initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new xlsreport.proxies.MxCellStyle(context, mendixObject);
	}

	public static xlsreport.proxies.MxCellStyle load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return xlsreport.proxies.MxCellStyle.initialize(context, mendixObject);
	}

	public static java.util.List<xlsreport.proxies.MxCellStyle> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<xlsreport.proxies.MxCellStyle> result = new java.util.ArrayList<xlsreport.proxies.MxCellStyle>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//XLSReport.MxCellStyle" + xpathConstraint))
			result.add(xlsreport.proxies.MxCellStyle.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of TextBold
	 */
	public final java.lang.Boolean getTextBold()
	{
		return getTextBold(getContext());
	}

	/**
	 * @param context
	 * @return value of TextBold
	 */
	public final java.lang.Boolean getTextBold(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.TextBold.toString());
	}

	/**
	 * Set value of TextBold
	 * @param textbold
	 */
	public final void setTextBold(java.lang.Boolean textbold)
	{
		setTextBold(getContext(), textbold);
	}

	/**
	 * Set value of TextBold
	 * @param context
	 * @param textbold
	 */
	public final void setTextBold(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean textbold)
	{
		getMendixObject().setValue(context, MemberNames.TextBold.toString(), textbold);
	}

	/**
	 * @return value of TextItalic
	 */
	public final java.lang.Boolean getTextItalic()
	{
		return getTextItalic(getContext());
	}

	/**
	 * @param context
	 * @return value of TextItalic
	 */
	public final java.lang.Boolean getTextItalic(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.TextItalic.toString());
	}

	/**
	 * Set value of TextItalic
	 * @param textitalic
	 */
	public final void setTextItalic(java.lang.Boolean textitalic)
	{
		setTextItalic(getContext(), textitalic);
	}

	/**
	 * Set value of TextItalic
	 * @param context
	 * @param textitalic
	 */
	public final void setTextItalic(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean textitalic)
	{
		getMendixObject().setValue(context, MemberNames.TextItalic.toString(), textitalic);
	}

	/**
	 * @return value of TextUnderline
	 */
	public final java.lang.Boolean getTextUnderline()
	{
		return getTextUnderline(getContext());
	}

	/**
	 * @param context
	 * @return value of TextUnderline
	 */
	public final java.lang.Boolean getTextUnderline(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.TextUnderline.toString());
	}

	/**
	 * Set value of TextUnderline
	 * @param textunderline
	 */
	public final void setTextUnderline(java.lang.Boolean textunderline)
	{
		setTextUnderline(getContext(), textunderline);
	}

	/**
	 * Set value of TextUnderline
	 * @param context
	 * @param textunderline
	 */
	public final void setTextUnderline(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean textunderline)
	{
		getMendixObject().setValue(context, MemberNames.TextUnderline.toString(), textunderline);
	}

	/**
	 * Set value of TextAlignment
	 * @param textalignment
	 */
	public final xlsreport.proxies.TextAlignment getTextAlignment()
	{
		return getTextAlignment(getContext());
	}

	/**
	 * @param context
	 * @return value of TextAlignment
	 */
	public final xlsreport.proxies.TextAlignment getTextAlignment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TextAlignment.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.TextAlignment.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TextAlignment
	 * @param textalignment
	 */
	public final void setTextAlignment(xlsreport.proxies.TextAlignment textalignment)
	{
		setTextAlignment(getContext(), textalignment);
	}

	/**
	 * Set value of TextAlignment
	 * @param context
	 * @param textalignment
	 */
	public final void setTextAlignment(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.TextAlignment textalignment)
	{
		if (textalignment != null)
			getMendixObject().setValue(context, MemberNames.TextAlignment.toString(), textalignment.toString());
		else
			getMendixObject().setValue(context, MemberNames.TextAlignment.toString(), null);
	}

	/**
	 * Set value of TextVerticalalignment
	 * @param textverticalalignment
	 */
	public final xlsreport.proxies.TextVerticalAlignment getTextVerticalalignment()
	{
		return getTextVerticalalignment(getContext());
	}

	/**
	 * @param context
	 * @return value of TextVerticalalignment
	 */
	public final xlsreport.proxies.TextVerticalAlignment getTextVerticalalignment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TextVerticalalignment.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.TextVerticalAlignment.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TextVerticalalignment
	 * @param textverticalalignment
	 */
	public final void setTextVerticalalignment(xlsreport.proxies.TextVerticalAlignment textverticalalignment)
	{
		setTextVerticalalignment(getContext(), textverticalalignment);
	}

	/**
	 * Set value of TextVerticalalignment
	 * @param context
	 * @param textverticalalignment
	 */
	public final void setTextVerticalalignment(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.TextVerticalAlignment textverticalalignment)
	{
		if (textverticalalignment != null)
			getMendixObject().setValue(context, MemberNames.TextVerticalalignment.toString(), textverticalalignment.toString());
		else
			getMendixObject().setValue(context, MemberNames.TextVerticalalignment.toString(), null);
	}

	/**
	 * Set value of TextColor
	 * @param textcolor
	 */
	public final xlsreport.proxies.MxColor getTextColor()
	{
		return getTextColor(getContext());
	}

	/**
	 * @param context
	 * @return value of TextColor
	 */
	public final xlsreport.proxies.MxColor getTextColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TextColor.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.MxColor.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TextColor
	 * @param textcolor
	 */
	public final void setTextColor(xlsreport.proxies.MxColor textcolor)
	{
		setTextColor(getContext(), textcolor);
	}

	/**
	 * Set value of TextColor
	 * @param context
	 * @param textcolor
	 */
	public final void setTextColor(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxColor textcolor)
	{
		if (textcolor != null)
			getMendixObject().setValue(context, MemberNames.TextColor.toString(), textcolor.toString());
		else
			getMendixObject().setValue(context, MemberNames.TextColor.toString(), null);
	}

	/**
	 * @return value of TextHeight
	 */
	public final java.lang.Integer getTextHeight()
	{
		return getTextHeight(getContext());
	}

	/**
	 * @param context
	 * @return value of TextHeight
	 */
	public final java.lang.Integer getTextHeight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TextHeight.toString());
	}

	/**
	 * Set value of TextHeight
	 * @param textheight
	 */
	public final void setTextHeight(java.lang.Integer textheight)
	{
		setTextHeight(getContext(), textheight);
	}

	/**
	 * Set value of TextHeight
	 * @param context
	 * @param textheight
	 */
	public final void setTextHeight(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer textheight)
	{
		getMendixObject().setValue(context, MemberNames.TextHeight.toString(), textheight);
	}

	/**
	 * Set value of BackgroundColor
	 * @param backgroundcolor
	 */
	public final xlsreport.proxies.MxColor getBackgroundColor()
	{
		return getBackgroundColor(getContext());
	}

	/**
	 * @param context
	 * @return value of BackgroundColor
	 */
	public final xlsreport.proxies.MxColor getBackgroundColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.BackgroundColor.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.MxColor.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of BackgroundColor
	 * @param backgroundcolor
	 */
	public final void setBackgroundColor(xlsreport.proxies.MxColor backgroundcolor)
	{
		setBackgroundColor(getContext(), backgroundcolor);
	}

	/**
	 * Set value of BackgroundColor
	 * @param context
	 * @param backgroundcolor
	 */
	public final void setBackgroundColor(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxColor backgroundcolor)
	{
		if (backgroundcolor != null)
			getMendixObject().setValue(context, MemberNames.BackgroundColor.toString(), backgroundcolor.toString());
		else
			getMendixObject().setValue(context, MemberNames.BackgroundColor.toString(), null);
	}

	/**
	 * @return value of TextRotation
	 */
	public final java.lang.Integer getTextRotation()
	{
		return getTextRotation(getContext());
	}

	/**
	 * @param context
	 * @return value of TextRotation
	 */
	public final java.lang.Integer getTextRotation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TextRotation.toString());
	}

	/**
	 * Set value of TextRotation
	 * @param textrotation
	 */
	public final void setTextRotation(java.lang.Integer textrotation)
	{
		setTextRotation(getContext(), textrotation);
	}

	/**
	 * Set value of TextRotation
	 * @param context
	 * @param textrotation
	 */
	public final void setTextRotation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer textrotation)
	{
		getMendixObject().setValue(context, MemberNames.TextRotation.toString(), textrotation);
	}

	/**
	 * @return value of WrapText
	 */
	public final java.lang.Boolean getWrapText()
	{
		return getWrapText(getContext());
	}

	/**
	 * @param context
	 * @return value of WrapText
	 */
	public final java.lang.Boolean getWrapText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.WrapText.toString());
	}

	/**
	 * Set value of WrapText
	 * @param wraptext
	 */
	public final void setWrapText(java.lang.Boolean wraptext)
	{
		setWrapText(getContext(), wraptext);
	}

	/**
	 * Set value of WrapText
	 * @param context
	 * @param wraptext
	 */
	public final void setWrapText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean wraptext)
	{
		getMendixObject().setValue(context, MemberNames.WrapText.toString(), wraptext);
	}

	/**
	 * @return value of BorderTop
	 */
	public final java.lang.Integer getBorderTop()
	{
		return getBorderTop(getContext());
	}

	/**
	 * @param context
	 * @return value of BorderTop
	 */
	public final java.lang.Integer getBorderTop(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.BorderTop.toString());
	}

	/**
	 * Set value of BorderTop
	 * @param bordertop
	 */
	public final void setBorderTop(java.lang.Integer bordertop)
	{
		setBorderTop(getContext(), bordertop);
	}

	/**
	 * Set value of BorderTop
	 * @param context
	 * @param bordertop
	 */
	public final void setBorderTop(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer bordertop)
	{
		getMendixObject().setValue(context, MemberNames.BorderTop.toString(), bordertop);
	}

	/**
	 * @return value of BorderBottom
	 */
	public final java.lang.Integer getBorderBottom()
	{
		return getBorderBottom(getContext());
	}

	/**
	 * @param context
	 * @return value of BorderBottom
	 */
	public final java.lang.Integer getBorderBottom(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.BorderBottom.toString());
	}

	/**
	 * Set value of BorderBottom
	 * @param borderbottom
	 */
	public final void setBorderBottom(java.lang.Integer borderbottom)
	{
		setBorderBottom(getContext(), borderbottom);
	}

	/**
	 * Set value of BorderBottom
	 * @param context
	 * @param borderbottom
	 */
	public final void setBorderBottom(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer borderbottom)
	{
		getMendixObject().setValue(context, MemberNames.BorderBottom.toString(), borderbottom);
	}

	/**
	 * @return value of BorderLeft
	 */
	public final java.lang.Integer getBorderLeft()
	{
		return getBorderLeft(getContext());
	}

	/**
	 * @param context
	 * @return value of BorderLeft
	 */
	public final java.lang.Integer getBorderLeft(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.BorderLeft.toString());
	}

	/**
	 * Set value of BorderLeft
	 * @param borderleft
	 */
	public final void setBorderLeft(java.lang.Integer borderleft)
	{
		setBorderLeft(getContext(), borderleft);
	}

	/**
	 * Set value of BorderLeft
	 * @param context
	 * @param borderleft
	 */
	public final void setBorderLeft(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer borderleft)
	{
		getMendixObject().setValue(context, MemberNames.BorderLeft.toString(), borderleft);
	}

	/**
	 * @return value of BorderRight
	 */
	public final java.lang.Integer getBorderRight()
	{
		return getBorderRight(getContext());
	}

	/**
	 * @param context
	 * @return value of BorderRight
	 */
	public final java.lang.Integer getBorderRight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.BorderRight.toString());
	}

	/**
	 * Set value of BorderRight
	 * @param borderright
	 */
	public final void setBorderRight(java.lang.Integer borderright)
	{
		setBorderRight(getContext(), borderright);
	}

	/**
	 * Set value of BorderRight
	 * @param context
	 * @param borderright
	 */
	public final void setBorderRight(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer borderright)
	{
		getMendixObject().setValue(context, MemberNames.BorderRight.toString(), borderright);
	}

	/**
	 * Set value of BorderColor
	 * @param bordercolor
	 */
	public final xlsreport.proxies.MxColor getBorderColor()
	{
		return getBorderColor(getContext());
	}

	/**
	 * @param context
	 * @return value of BorderColor
	 */
	public final xlsreport.proxies.MxColor getBorderColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.BorderColor.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.MxColor.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of BorderColor
	 * @param bordercolor
	 */
	public final void setBorderColor(xlsreport.proxies.MxColor bordercolor)
	{
		setBorderColor(getContext(), bordercolor);
	}

	/**
	 * Set value of BorderColor
	 * @param context
	 * @param bordercolor
	 */
	public final void setBorderColor(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxColor bordercolor)
	{
		if (bordercolor != null)
			getMendixObject().setValue(context, MemberNames.BorderColor.toString(), bordercolor.toString());
		else
			getMendixObject().setValue(context, MemberNames.BorderColor.toString(), null);
	}

	/**
	 * Set value of Format
	 * @param format
	 */
	public final xlsreport.proxies.CellFormat getFormat()
	{
		return getFormat(getContext());
	}

	/**
	 * @param context
	 * @return value of Format
	 */
	public final xlsreport.proxies.CellFormat getFormat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Format.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.CellFormat.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Format
	 * @param format
	 */
	public final void setFormat(xlsreport.proxies.CellFormat format)
	{
		setFormat(getContext(), format);
	}

	/**
	 * Set value of Format
	 * @param context
	 * @param format
	 */
	public final void setFormat(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.CellFormat format)
	{
		if (format != null)
			getMendixObject().setValue(context, MemberNames.Format.toString(), format.toString());
		else
			getMendixObject().setValue(context, MemberNames.Format.toString(), null);
	}

	/**
	 * @return value of DecimalPlaces
	 */
	public final java.lang.Integer getDecimalPlaces()
	{
		return getDecimalPlaces(getContext());
	}

	/**
	 * @param context
	 * @return value of DecimalPlaces
	 */
	public final java.lang.Integer getDecimalPlaces(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.DecimalPlaces.toString());
	}

	/**
	 * Set value of DecimalPlaces
	 * @param decimalplaces
	 */
	public final void setDecimalPlaces(java.lang.Integer decimalplaces)
	{
		setDecimalPlaces(getContext(), decimalplaces);
	}

	/**
	 * Set value of DecimalPlaces
	 * @param context
	 * @param decimalplaces
	 */
	public final void setDecimalPlaces(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer decimalplaces)
	{
		getMendixObject().setValue(context, MemberNames.DecimalPlaces.toString(), decimalplaces);
	}

	/**
	 * @return value of DataFormatString
	 */
	public final java.lang.String getDataFormatString()
	{
		return getDataFormatString(getContext());
	}

	/**
	 * @param context
	 * @return value of DataFormatString
	 */
	public final java.lang.String getDataFormatString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DataFormatString.toString());
	}

	/**
	 * Set value of DataFormatString
	 * @param dataformatstring
	 */
	public final void setDataFormatString(java.lang.String dataformatstring)
	{
		setDataFormatString(getContext(), dataformatstring);
	}

	/**
	 * Set value of DataFormatString
	 * @param context
	 * @param dataformatstring
	 */
	public final void setDataFormatString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String dataformatstring)
	{
		getMendixObject().setValue(context, MemberNames.DataFormatString.toString(), dataformatstring);
	}

	/**
	 * @return value of MxCellStyle_Template
	 */
	public final xlsreport.proxies.MxTemplate getMxCellStyle_Template() throws com.mendix.core.CoreException
	{
		return getMxCellStyle_Template(getContext());
	}

	/**
	 * @param context
	 * @return value of MxCellStyle_Template
	 */
	public final xlsreport.proxies.MxTemplate getMxCellStyle_Template(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.MxTemplate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxCellStyle_Template.toString());
		if (identifier != null)
			result = xlsreport.proxies.MxTemplate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxCellStyle_Template
	 * @param mxcellstyle_template
	 */
	public final void setMxCellStyle_Template(xlsreport.proxies.MxTemplate mxcellstyle_template)
	{
		setMxCellStyle_Template(getContext(), mxcellstyle_template);
	}

	/**
	 * Set value of MxCellStyle_Template
	 * @param context
	 * @param mxcellstyle_template
	 */
	public final void setMxCellStyle_Template(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxTemplate mxcellstyle_template)
	{
		if (mxcellstyle_template == null)
			getMendixObject().setValue(context, MemberNames.MxCellStyle_Template.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxCellStyle_Template.toString(), mxcellstyle_template.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mxCellStyleMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final xlsreport.proxies.MxCellStyle that = (xlsreport.proxies.MxCellStyle) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "XLSReport.MxCellStyle";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
