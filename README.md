# A11yComposeManualListSemanticsTest

Demonstrates how to manually add accessibility list semantics to a non-dynamic column of text items. 

Accessibility list semantics -- for example, TalkBack reading "in list" on entry to a list, "1 of 4" for a list item, and "out of list" on exit from a list -- is automatic for dynamic lists like LazyColumn.
However, Column does not provide list semantics automatically, since most columns are purely for layout purposes and do not represent semantic meaning.
In the case of a numbered list, however, a Column does itself have semantic meaning that would otherwise be presented only visually.
The Semantics collectionInfo and collectionItemInfo properties allow us to manually annotate Columns and their contents accordingly.

Note: collectionItemInfo "index" properties are zero-based.

